package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Size extends JFrame implements KeyListener {
    private JPanel panel;
    private JTextField field;
    private JLabel label;
    private int fontSize = 20;

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            fontSize += 2;  // 위쪽 화살표 키: 글자 크기 증가
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            fontSize = Math.max(10, fontSize - 2);  // 아래쪽 화살표 키: 글자 크기 감소 (최소 크기 10)
        }
        label.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public Size() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("글자 크기 조절");

        label = new JLabel("글자 크기 조절");
        label.setFont(new Font("Arial", Font.PLAIN, fontSize));

        field = new JTextField(20);
        field.addKeyListener(this);  // JTextField에 KeyListener 추가

        panel = new JPanel();
        panel.add(label);
        panel.add(field);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Size();
    }
}
