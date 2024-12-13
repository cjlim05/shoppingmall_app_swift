import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExcelManager {

    private static final String FILE_PATH = "orders.xlsx"; // 저장될 엑셀 파일 경로

    // 엑셀 파일에 데이터 추가
    public static void saveToExcel(String name, int price) {
        try {
            File file = new File(FILE_PATH);
            Workbook workbook;
            Sheet sheet;

            // 엑셀 파일이 존재하면 읽어오고, 없으면 새로 생성
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                workbook = WorkbookFactory.create(fis);
                sheet = workbook.getSheetAt(0);
                fis.close();
            } else {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Orders");
                createHeaderRow(sheet); // 헤더 생성
            }

            // 새로운 행 추가
            int lastRow = sheet.getLastRowNum();
            Row row = sheet.createRow(lastRow + 1);

            // 현재 시간
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            // 데이터 입력
            row.createCell(0).setCellValue(currentTime); // 시간
            row.createCell(1).setCellValue(name);        // 이름
            row.createCell(2).setCellValue(price);       // 가격

            // 엑셀 파일 저장
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            workbook.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 헤더 생성
    private static void createHeaderRow(Sheet sheet) {
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Time");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Price");
    }
}
