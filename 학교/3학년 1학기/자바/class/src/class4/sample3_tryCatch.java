package class4;
import java.util.Scanner;
public class sample3_tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("나뉨수 :");
            int divided = sc.nextInt();
            System.out.println("나눗수 :");
            int divisor = sc.nextInt();
            try{
                System.out.println(divided+" / "+divisor+" = "+ divided/divisor+"입니다");
                break;
            }
            catch(ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                e.printStackTrace(); //오류가 빨간색으로 표시
            }

        }
    }
}
