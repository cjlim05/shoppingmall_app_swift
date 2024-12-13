package class6;

import class5.Circle;

public class CircleArea {
    int radius;
    //반지름 10으로 지정하는 기본생성자 추가, 반드시 아래 생성자를 호출해야함
    public CircleArea(int radius){
        this.radius = radius;
    }
    public CircleArea(){
        this(10);
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        CircleArea my = new CircleArea();
        System.out.println((int)(my.getArea())+"");

        CircleArea c[] = new CircleArea[5];  //객체참조5개
        for(int i=0; i<c.length;i++)
            c[i] = new CircleArea(i);   //객체를 생성하여 객체를 가리키도록 함.
        for(int i=0; i<c.length;i++)
            System.out.println((int)(c[i].getArea())+"");
    }
}
