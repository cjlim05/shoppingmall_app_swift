package class4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class sample4_inputmistake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수3개를 입력 할 것");
        int sum =0, n=0;
        for(int i=0;i<3;i++){
            System.out.println(i+">>");
            try{
                n= sc.nextInt();
                sum += n;
            }
            catch(InputMismatchException e){
                System.out.println("정수 아님, 다시 입력");
                sc.next(); // 입력 스트림에 있는 정수가 아닌 내용을 버림 nextInt()에서 int로 형 변환을 못해도 그 값이 안에 있다.
                i--;
                //continue; //다음 루프로 이동
            }

        }
        System.out.println("합은 "+ sum+"입니다.");

    }
}
