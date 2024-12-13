class Person{
    String name, id;
    public Person(String name) {this.name = name;}
}
class Student extends Person{
    String grade, depth;
    public Student(String name) {super(name);}
}
public class upcasting {
    public static void main(String[] args) {
        //Person p;
        Person p = new Student("kim"); //이것도 upcating이다.
        Student s = new Student("lee");
        p = s;//upcasting, 업케스팅을 하면 편한ㄷ .

        System.out.println(p.name);

//        p.grade = "A";    컴파일 오류
        s.grade = "A"; //이거는 가능, p는 person의 레퍼런스이다.
//        p.depth = "CS";

        Student t = (Student)p;  //downcasting, p가 가리키고 있는 것은 student를 가리키고 있는 거다, upcasting한것을 downcasting을 한거
        t.grade = "A";
        t.depth = "CS";

//        Person q = new Person("park");   //downcasting
//        Student u = (Student)q; // 실행을 시키면 실행이 되지않는다. (class Person cannot be cast to class Student)
//        //여기서는 q가 가리키는게 person이기 때문에 실행이 되지 않는다.
//        u.grade = "A";

//        if(p instanceof Student){
//            Student t =(Student)p;
//
//        }
    }
}
