public class BoxEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = Integer.valueOf(n);
        System.out.println("intObject = " + intObject);

        //int m = 10;
        int m = intObject.intValue() + 10;
        System.out.println("m = " +m);
    }
}
