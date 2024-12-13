class Shape{
    public void draw(){System.out.println("Shape");}
}

class Line extends Shape {
    public void draw(){System.out.println("Line");}  //overriding
}

class Rect extends Shape {
    public void draw(){System.out.println("Rect");}//overriding
}

class Circle extends Shape {
    public void draw(){System.out.println("Circle");}//overriding
}

public class MethodOverriding {
    static void paint(Shape p) {p.draw();}
    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());  //upcasting
        paint(new Rect());  //upcasting
        paint(new Circle());    //upcasting

    }
}
