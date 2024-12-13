package class5;

public class ex1TV {
//이름 연도 크기 데이터 필드 선언
    String brand;
    int year, size;
    public ex1TV(String b, int y, int s){brand = b; year = y; size = s;}


    public String getName(){return brand;}
    public int getYear(){return year;}
    public int getSize(){return size;}
    public static void main(String[] args) {
        ex1TV myTv = new ex1TV("LG", 2017, 32);
        System.out.println(myTv.getName() +" "+ myTv.getYear()+" "+myTv.getSize());
    }
}
