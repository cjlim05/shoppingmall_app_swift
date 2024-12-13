package example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class midPrac {
    String name;
    double height, weight;
    void show(){System.out.println(name+" "+height+" "+weight);}

    public midPrac(String name, double height, double weight){this.name= name;this.height=height;this.weight=weight;}

    public double getAvg(){return height;}

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        midPrac[] hi = new midPrac[2];

        for(int i=0; i<hi.length;i++){
            System.out.println(">>이름을 입력하세요"); String name = scanner.nextLine();
            System.out.println(">>몸무게를 입력하세요"); int height = scanner.nextInt();
            System.out.println(">>키를 입력하세요"); int weight = scanner.nextInt();
            hi[i] = new midPrac(name, height, weight);
            scanner.next();
        }
        for(int i=0; i<hi.length;i++){
            hi[i].show();
        }
    }

    }

