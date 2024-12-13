class Point{
    private int x,y;
    public Point(int x, int y) {this.x = x; this.y = y;}
    public int getX(){return x;}
    public int getY(){return y;}
    public void move(int x, int y){this.x = x; this.y = y;}

}
class ColorPoint extends Point{
    String color; //color 데이터 필드
    //생성자
    public ColorPoint(int x, int y, String color) {super(x,y);this.color=color;}
    //setXY
    public void setXY(int x, int y) {move(x,y);}
    //setColor
    public void setColor(String color) {this.color = color;}
    //toString
    public String toString(){return color+"색("+getX()+","+getY()+")점";};
}
public class chap5Ex5 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str = cp.toString();
        System.out.println(str);
    }
}
