import java.util.random.*;
import java.util.Scanner;
public class rock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int computer = (int) (Math.random() * 3 +1);
            System.out.println("가위(1) 바위(2) 보(3) 끝내기(4)");
            int user = scanner.nextInt();
            if(user==4) break;
            else{
                if(computer == user) System.out.println("비김");
                else if((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) System.out.println("짐");
                else System.out.println("이김");
            }
        }
    }
}
