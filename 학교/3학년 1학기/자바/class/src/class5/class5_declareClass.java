package class5;



public class class5_declareClass {

    int radius;
    String name;
    public class5_declareClass(){}
    public double getArea(){return 3.14*radius*radius;}
    public static void main(String[] args) {
        class5_declareClass pizza = new class5_declareClass();
        pizza.radius = 10;
        pizza.name = "자바피자";
        System.out.println(pizza.name+"의 면적은"+pizza.getArea());

        class5_declareClass donut = new class5_declareClass();
        donut.radius = 2;
        donut.name = "자바도넛";
        System.out.println(donut.name +"의 면적은" +donut.getArea());
    }
}
