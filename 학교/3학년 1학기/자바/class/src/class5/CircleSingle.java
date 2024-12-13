package class5;

public class CircleSingle {
    int radius;
    String name;

//    public CircleSingle(){radius = 1; name ="";} //<- 기본 생성자
//    public CircleSingle(int r, String n) {radius = r; name =n;}
    public double getArea() {return 3*radius*radius;}

    public static void main(String[] args) {
//        CircleSingle pizza = new CircleSingle(10, "자바피자");
//        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());

        CircleSingle donut = new CircleSingle();  //<- 기본생성자로 객체 생성
//        donut.name  = "자바도넛";
        System.out.println(donut.name+"의 면적은 " + donut.getArea());
        System.out.println("실행됨");

    }

    //생성자가 하나도 없을 떄만 기본 생성자 준다 BUT 생성자가 하나라도 있다면 오류가 생긴다(즉 메소드가 있어야 한다.)
}
