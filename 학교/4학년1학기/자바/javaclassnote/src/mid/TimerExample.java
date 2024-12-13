package mid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerExample implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("beep");
    }
    public static void main(String[] args) {
        ActionListener listener = new TimerExample();
        Timer t = new Timer(1000, listener); // javax.swing.Timer 사용
        t.start();

        // 1000번 반복하면서 1초씩 대기
        for (int i = 1; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
