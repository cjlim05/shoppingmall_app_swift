package class5;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args){
        System.out.println("정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<100; i++){
            int cheak = num * i;
            if(cheak<100){
                sum += num * i;
                System.out.println(sum);
            }
            else break;
        }
        System.out.println("1부터100까지 정수 중에서" +num+"의 배수의 총합은"+sum+"입니다.");
    }
}
