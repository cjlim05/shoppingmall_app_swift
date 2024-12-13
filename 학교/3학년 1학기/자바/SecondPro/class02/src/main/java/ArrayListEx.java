import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<String>();

        for(int i=0; i<4;i++){
            System.out.println("이름을 입력하세요");
            String s = scanner.next();
            a.add(s);
        }
        for(int i=0; i<4;i++){
            String name = a.get(i);
            System.out.println(name+"");
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0; i<4;i++){
            System.out.println("숫자를 입력하세요");
            int k = scanner.nextInt();
            b.add(k);
        }
        for(int i=0; i<4;i++){
            int num = b.get(i);
            System.out.println(num+"");
        }
    }
}
