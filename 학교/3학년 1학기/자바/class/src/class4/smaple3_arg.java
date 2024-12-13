package class4;

public class smaple3_arg {
    public static void main(String[] args) {
        double sum =4.0;

        System.out.println("인자 개수 = "+args.length);

        for(int i=0; i<args.length;i++)
            sum += Double.parseDouble(args[i]);

        System.out.println("합계 : "+ sum);
    }
}
