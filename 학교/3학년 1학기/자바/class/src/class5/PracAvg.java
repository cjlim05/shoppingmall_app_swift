package class5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PracAvg {
    //학생수 3, 과목2, 과목별 평균 구하기
    public static void main(String[] args) {
        int student = 3;
        int subject = 2;
        int classAvg[][] = new int[student][subject];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<classAvg.length;i++){
            for(int j=0;j<classAvg[i].length;j++){
                while(true){
                    try{
                        System.out.println("학생"+i+"의 점수를 입력하세요");
                        classAvg[i][j] = scanner.nextInt();
                        break;
                    }
                    catch(InputMismatchException e){
                        System.out.println("잘못입력합 ㅅㄱ");
                        scanner.nextLine();
                    }
                }

            }
        }
        for (int i = 0; i < classAvg.length; i++) {
            double avg = (classAvg[i][0] + classAvg[i][1]) / 2.0;
            System.out.println("학생 " + (i+1) + ": " + classAvg[i][0] + " " + classAvg[i][1] + " 평균 = " + avg);
        }
    }
}
