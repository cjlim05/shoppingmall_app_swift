package class4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class sample4_ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0,m=0;
        for(int i=0;i<2;i++){
            System.out.println("두 수 입력>> ");
            try{
                n = sc.nextInt();
                m = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("실수 입력은 안된다");
                i--;
                sc.next();
            }
        }
        System.out.println(n+"x"+m+"="+n*m);
        sc.close();
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            try{
//                System.out.println("두 수 입력>> ");
//                int n = sc.nextInt();
//                int m = sc.nextInt();
//                System.out.println(n+"x"+m+"="+n*m);
//                break;
//            }
//            catch(InputMismatchException e){
//                System.out.println("실수 입력은 안된다");
//                sc.nextLine();
//            }
//        }
//
//        sc.close();
    }
}
