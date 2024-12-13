import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelManager {

    private static final String FILE_NAME = "orders.xlsx"; // 엑셀 파일 이름
    private Workbook workbook;
    private Sheet sheet;

    public ExcelManager() {
        try {
            File file = new File(FILE_NAME);

            // 엑셀 파일이 존재하면 열고, 없으면 새로 생성
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0); // 첫 번째 시트를 가져옴
            } else {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Orders"); // 새로운 시트 생성
                createHeaderRow(); // 헤더 행 추가
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 헤더 행 생성
    private void createHeaderRow() {
        Row headerRow = sheet.createRow(0); // 첫 번째 행 생성
        headerRow.createCell(0).setCellValue("시간");
        headerRow.createCell(1).setCellValue("이름");
        headerRow.createCell(2).setCellValue("가격");
    }

    // 주문 데이터 추가 메서드
    public void addOrder(String time, String name, int price) {
        int rowCount = sheet.getLastRowNum() + 1; // 마지막 행 다음에 추가
        Row row = sheet.createRow(rowCount);

        row.createCell(0).setCellValue(time);
        row.createCell(1).setCellValue(name);
        row.createCell(2).setCellValue(price);
    }

    // 엑셀 파일 저장
    public void save() {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            workbook.write(fos); // 변경된 내용을 파일에 기록
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
