import java.util.Scanner;
class Shape{
    private String color;
    public Shape() {this.color = "BLACK";}
    public Shape(String color) {this.color = color;}
    public void draw() {System.out.print("color = " + this.color);}
    public String getColor() {return color;}
}

class Circle extends Shape{
    private int x, y, radius;
    public Circle(){ super();this.x = 0; this.y = 0; this.radius=10; }
    public Circle(int x, int y, int radius, String color){this.x = x; this.y = y;}

    public void draw() {
        System.out.print("Circle: ");
        super.draw();
        System.out.print(", center = (" + x + "," + y + "), radius = " + radius);
    }
}

class Rect extends Shape{
    private int x, y, width, height;
    public Rect(){super(); this.x = 0; this.y = 0; this.width=10; this.height=10;}
    public Rect(int x, int y, int width, int height, String color){ super(color); this.x = 0; this.y = 0; this.width=width; this.height=height;}

    public void draw() {
        System.out.print("Rect: ");
        super.draw();
        System.out.print(", topleft = (" + x + "," + y + "), width = " + width + ", height = " + height);
    }
}

public class ShapeOutput {
    public static void main(String[] args) {
        Circle shaped = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("number of shapes: ");
        int num = sc.nextInt();

        Shape[] shapes = new Shape[num];

        for(int i =0; i<num; i++) {
            System.out.println("1:Circle 2:Rect");
            int ShapeType = sc.nextInt();
            System.out.println("1:Default value 2:Specify dimension & color");
            int Mood = sc.nextInt();
            if(ShapeType==1){
                if(Mood==1){
                    shapes[i] = new Circle();
                }else{
                    System.out.print("x y radius color: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int radius = sc.nextInt();
                    String color = sc.next();
                    shapes[i] = new Circle(x, y, radius, color);
                }
            }else{
                if(Mood==1){
                    shapes[i] = new Rect();
                }else{
                    System.out.print("x y width height color: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int width = sc.nextInt();
                    int height = sc.nextInt();
                    String color = sc.next();
                    shapes[i] = new Rect(x, y, width, height, color);
                }
            }
        }
        System.out.println("\nInvoking draw() for each Shape object...");
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
        sc.close();

    }
}
