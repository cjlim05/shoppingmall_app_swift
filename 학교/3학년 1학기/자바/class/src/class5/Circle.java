package class5;

import java.awt.*;

public class Circle {
    int radius;
    String name;

    //생성자
    public Circle(){radius = 1; name ="";}
    public Circle(int r, String n) {radius = r; name =n;}

    public double getArea() {return 3.14*radius*radius;}

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());

        Circle donut = new Circle();
        donut.name  = "자바도넛";
        System.out.println(donut.name+"의 면적은 " + donut.getArea());
    }
}
