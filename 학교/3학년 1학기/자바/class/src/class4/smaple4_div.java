package class4;
import java.util.Scanner;

public class smaple4_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diviidend;
        int divisor;

        System.out.println("나뉨수 :");
        diviidend = sc.nextInt();
        System.out.println("나눗수 :");
        divisor = sc.nextInt();
        System.out.println(diviidend+" / "+divisor+" = "+ diviidend/divisor);

    }
}


