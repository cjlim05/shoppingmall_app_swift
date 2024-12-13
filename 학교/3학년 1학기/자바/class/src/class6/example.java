package class6;

public class example {
// 데이터 필드
    String name;
    int age;
    double height, weight;
    public example(String name){this.name =name; }


//string name
// int age
//double height

    // 생성자 name 값을 받는 생성자

    public static void main(String[] args) {
        //이름 홀길동인 human 객체 생성, ahuman 참조변수를 가리킴
        example aHuman = new example("홍길동");
        //age 21, height 180.5 wieght 72
        aHuman.age = 21; aHuman.height=180; aHuman.weight=83.2;
        //크기가 5인 Human 객체의 배열을 생성,
        example array[] = new example[5];
        //이름을 모두 홀길동으로 하여' 5개 객체 생성
        for(int i=0; i<5; i++)
            array[i] = new example("홍길동");
    }
}
