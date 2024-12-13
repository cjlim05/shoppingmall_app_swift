package class5;
import java.util.Scanner;

public class rectangle {  //public을 삭제하면 class이름이 자바 파일 이름과 같이 않아도 된다.
    int width, height;

    public int getArea(){return width*height;}  //메소드

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rectangle rect = new rectangle();  //객체생성!

        System.out.print("가로 입력>>");
        rect.width = scanner.nextInt();
        System.out.print("세로 입력>>");
        rect.height = scanner.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());
    }
}
