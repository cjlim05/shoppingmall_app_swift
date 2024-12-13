package class8;

interface Phoneinterface{
    final int Timeout = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){System.out.println("** phone **");}
}
class SamsungPhone implements Phoneinterface{
    @Override
    public void sendCall(){System.out.println("send");}
    @Override
    public void receiveCall(){System.out.println("receive");}
    public void flash(){System.out.println("flash");}
}
public class InterfaceEx {

    public static void main(String[] args) {
        //이렇게 하면 samsungphone에 있는 메소드 사용 불가
        Phoneinterface  p = new SamsungPhone();
        p.printLogo();
        p.sendCall();
        p.receiveCall();

        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }

}
