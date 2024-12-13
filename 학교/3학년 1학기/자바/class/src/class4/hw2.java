package class4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        //학생 3명 과목2개 -> 정수형 선언
        //저장할 2차원 배열 만든다
        //예외 발생시 다시 발급받는다.
        int scores[][] = new int[3][2];
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("학생1 과목1 점수:");
                scores[0][0] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();}
        }

        while(true){
            try {
                System.out.print("학생1 과목2 점수:");
                scores[0][1] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();}
        }
        while(true){
            try {
                System.out.print("학생2 과목1 점수:");
                scores[1][0] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();}
        }

        while(true){
            try {
                System.out.print("학생2 과목2 점수:");
                scores[1][1] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();}
        }
        while(true){
            try {
                System.out.print("학생3 과목1 점수:");
                scores[2][0] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();
            }
        }

        while(true){
            try {
                System.out.print("학생3 과목2 점수:");
                scores[2][1] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                sc.nextLine();}
        }

        double st1_avg = (scores[0][0]+scores[0][1])/2.0;
        double st2_avg = (scores[1][0]+scores[1][1])/2.0;
        double st3_avg = (scores[2][0]+scores[2][1])/2.0;

        System.out.println("학생1:"+ scores[0][0]+" "+scores[0][1]+" 평균 = " +st1_avg);
        System.out.println("학생2:"+ scores[1][0]+" "+scores[1][1]+" 평균 = " +st2_avg);
        System.out.println("학생3:"+ scores[2][0]+" "+scores[2][1]+" 평균 = " +st3_avg);
    }
}
