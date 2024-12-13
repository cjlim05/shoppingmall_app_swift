package class8;

abstract class Shape{  //추상클래스는 추상 매소들를 갖는다.
    public abstract void draw();  //추상메소드: 선어부만 있고 구현부는 없음
}

abstract class Example extends Shape{} // 추상클래스를 상속했으나 추상 메소드 구현 안하면 추상 클래스
class Line extends  Shape{ //추상 클래스를 상속하여 추상 매소드 구현(추상 클래스를 상속하면 추상 매소드 구현은 필수)-> 위에처럼 추상클래스로 상속한다
    @Override
    public void draw(){
        System.out.println("line");
    }
}

class Rect extends  Shape{
    @Override
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends  Shape{
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}
public class ShapeEx {
    public static void main(String[] args) {
       // Shape shape = u Shape(); 추상 글래스임으로 객체를 생성 할 수 없다.
        Shape shape[] = new Shape[3];

        shape[0] = new Line();
        shape[1] = new Rect();
        shape[2] = new Circle();

        for(int i =0; i<3;i++) shape[i].draw();
    }
}
