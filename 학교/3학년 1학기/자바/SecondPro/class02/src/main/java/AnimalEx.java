//import java.util.Vector;
//
//class Animal{
//    int weight;
//    public Animal(int w){weight=w;}
//    public int getWeight(){return weight;}
//    public void sound(){System.out.println("...");} //미완성
//
//}
//
//class Dog extends Animal{
//    private String breed;
//    public Dog(String b, int w){
//        super(w);
//        breed = b;
//    }
//    @Override
//    public void sound() {System.out.println("멍멍");}
//}
//
//class Cat extends Animal{
//    private String breed;
//    public Cat(String c, int w){
//        super(w);
//        breed = c;
//    }
//    @Override
//    public void sound() {System.out.println("야옹");}
//                                                                                                       }
//public class AnimalEx {
//    Vector<Animal> v = new Vector<Animal>();
//    v.add(new Dog("잡종", 20));
//    v.add(new Cat("누렁", 20));
//    for(int i-0;i<v.size();i++){
//        Animal a = v.get(i);         //upcasting
//        a.sound();                     //dynamic binding 호출할때 메소드를 runtime에 결정
//    }
//}
