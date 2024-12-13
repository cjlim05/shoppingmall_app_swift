package class4;
import java.util.Scanner;
public class sample_outofrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[] {0,1,2,3,4};
        try{
            for(int i =0; i<6;i++)
                System.out.println("intArray[ "+ i+ "]" + "=" +intArray[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인데스가 범위를 벗어났습니다.");
        }

    }
}
