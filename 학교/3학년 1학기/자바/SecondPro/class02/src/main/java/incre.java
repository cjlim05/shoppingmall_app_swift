public class incre {
    public static void increment(int n){

    }
    public static void increment(Integer intObj){
        int n = intObj;
        intObj = ++n;
    }

    public static void main(String[] args) {
        int i = 1;
        increment(i);
        System.out.println("i"+i);

        Integer intObj = 1;
        increment(intObj);
        int j = intObj;
        increment(intObj);
    }
}
