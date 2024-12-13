package class4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        final int student = 3; //학생 수 정수형 상수로 선언
        final int score = 2;  //과목 수 정수형 상수로 선언

        int scores[][] = new int[student][score]; //학생들 별 점수 입력을 위한 2차원 배열 선언
        Scanner sc = new Scanner(System.in);

        // 각 학생의 점수 입력
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("학생 " + (i+1) + " 과목 " + (j+1) + " 점수: ");
                        scores[i][j] = sc.nextInt();
                        break;}
                    catch (InputMismatchException e) { // 정수 변환이 불가능한 경우 다시 입력받기
                        System.out.println("다시 입력하세요");
                        sc.next();}
                }
            }
        }

        // 입력 받은 점수와 학생별 평균을 출력
        for (int i = 0; i < scores.length; i++) {
            double avg = (scores[i][0] + scores[i][1]) / 2.0;
            System.out.println("학생 " + (i+1) + ": " + scores[i][0] + " " + scores[i][1] + " 평균 = " + avg);
        }
    }
}
