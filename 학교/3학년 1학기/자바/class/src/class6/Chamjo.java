package class6;

public class Chamjo {

    static void increase(int m) {m++;}

    static void increase(CircleArea c){c.radius++;}

    static void increase(int array[]){for(int i=0; i<array.length;i++) array[i]++;}

    public static void main(String[] args) {
        int m = 10;
        increase(m); //정수값 복사
        System.out.println(m);

        CircleArea pizza = new CircleArea(10);
        increase(pizza);
        System.out.println(pizza.radius);

        int a[] = {1,2,3,4,5,6};
        increase(a);
        for(int i=0; i<a.length;i++) System.out.println(a[i]);
    }
}
