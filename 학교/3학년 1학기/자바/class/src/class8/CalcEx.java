//320fg 11번 문제
package class8;

abstract class Calc {
    int a, b;
    public void setValue(int a, int b){
        this.a = a; this.b = b;
    }
    abstract public int calculate(); // 추상 메소드
}
class Add extends Calc{
    @Override
    public int calculate(){
        return a+b;
    }
}
class Sub extends Calc{
    @Override
    public int calculate(){
        return a-b;
    }
}
class Mult extends Calc{
    @Override
    public int calculate(){
        return a*b;
    }
}

class Div extends Calc{
    @Override
    public int calculate(){
        return a/b;
    }
}

public class CalcEx {
    public static void main(String[] args) {
        int x, y;
        Add add = new Add();
        add.setValue(2,1);
        System.out.println(add.calculate());
    }
}
