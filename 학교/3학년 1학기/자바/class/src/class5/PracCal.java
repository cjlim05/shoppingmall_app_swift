package class5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PracCal {
    int x,y;

    public int getX(){return x;}
    public int getY(){return y;}
    public int[] getNum(){
        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("첫번째 정수를 입력하세요");
                numbers[0] = scanner.nextInt();
                System.out.println("듀번째 정수를 입력하세요");
                numbers[1] = scanner.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("다시 입력하세요");
                scanner.nextLine();
            }
        }
        return numbers;
    }
    void powerOn(){System.out.println("전원을 켭니다.");}

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y){
        double result = (double) x/ (double) y;
        return result;
    }

    void powerOff(){System.out.println("전원을 끔니다.");}

    public static void main(String[] args) {
        PracCal cal = new PracCal();
        cal.powerOn();
        int number[] = cal.getNum();
        double result1 = cal.divide(number[0], number[1]);
        System.out.println("result1" +result1);
    }
}
