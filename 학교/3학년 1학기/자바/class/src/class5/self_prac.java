package class5;
import java.awt.desktop.SystemEventListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class self_prac {
    public static void main(String[] args) {
        boolean run = true;
        int valance = 0;

        do{
            System.out.println("-------------------------------");
            System.out.println("1.예금| 2.츌금| 3.잔고| 4.종료");

            System.out.println("-------------------------------");
            System.out.println("선택>>  ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            try{
                switch (choice){
                    case 1:
                        System.out.println("예금액>1000원");
                        break;
                    case 2:
                        System.out.println("출금액>1000원");
                        break;
                    case 3:
                        System.out.println("잔고>1000원");
                        break;
                    case 4:
                        System.out.println("프로그램 종료");
                        run = false;
                        break;
                }

            }
            catch(InputMismatchException e){
                System.out.println("다시 입력할 것");
                scanner.next();
            }
        }while(run);
    }

}
