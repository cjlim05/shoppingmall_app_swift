class AirplaneMoode{
    public void land() {
        System.out.println("착륙합니다");
    }
    public void fly(){
        System.out.println("일반비행합니다.");
    }

    public void takeOff(){
        System.out.println("이륙합니다.");
    }
}

class SupersonAirplane extends AirplaneMoode{
    public static int NORMAL = 1;
    public static  int SUPERSONIC = 2;

    public int flyMood = NORMAL;
}

public class Airplane {
    public static void main(String[] args) {
        SupersonAirplane sa = new SupersonAirplane();
        sa.fly();
    }
}
