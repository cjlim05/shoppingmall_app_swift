package mid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Name extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;
    private JButton btn;
    private JLabel label;

    public Name(){

        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이름 입력");

        label = new JLabel("안녕하세요 "+ " "+ "입니다.");
        txt = new JTextField(40);
        panel = new JPanel();
        txt.setText("이름을 입력하세요");
        btn = new JButton("제출하기");
        panel.add(txt); // 텍스트 필드를 패널에 추가
        panel.add(btn); // 버튼을 패널에 추가
        panel.add(label);
        btn.addActionListener(this);
        add(panel);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("안녕하세요 "+ txt.getText() +"입니다.");
    }


    public static void main(String[] args) {
        Name n = new Name();
    }
}
