package mid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JButton button, mbutton;

    private int count = 0;
    public Counter(){
        JPanel panel = new JPanel();
        label1 = new JLabel("Counter");
        panel.add(label1);

        label2 = new JLabel(" "+ count);
        panel.add(label2);

        button = new JButton("카운터 증가");
        panel.add(button);
        button.addActionListener(this);

        mbutton = new JButton("카운터 감소");
        panel.add(mbutton);
        mbutton.addActionListener(this);

        add(panel);
        setSize(300,200);
        setTitle("Counter");
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("카운터 증가")) {
            count++; // 카운트 증가
        } else if (e.getActionCommand().equals("카운터 감소")) {
            count--; // 카운트 감소
        }
        label2.setText("카운트: " + count);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
