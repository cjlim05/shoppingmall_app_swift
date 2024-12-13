package class4;

public class sample4_ex11 {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;
        System.out.println("인자 개수 = " +args.length);
        for(int i=0;i<args.length;i++){
            try{
                 sum += Double.parseDouble(args[i]);
                 count +=1;
            }
            catch(NumberFormatException e){
                System.out.println(args[i]+"는 정수로 바꿀 수 없습니다.");

            }
        }
        double avg = sum/count;
        System.out.println("평균값은 "+avg+"입니다.");
    }
}
