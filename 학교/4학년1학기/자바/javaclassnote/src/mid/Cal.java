//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class Cal extends JFrame {
//    private JTextField display;
//    private JButton[] numberButtons;
//    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
//
//    public Cal() {
//        // 기본 창 설정
//        this.setSize(400, 500);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setTitle("계산기");
//
//        // 패널 설정
//        JPanel panel = new JPanel();
//        panel.setLayout(new BorderLayout());
//
//        // 디스플레이 창
//        display = new JTextField();
//        display.setHorizontalAlignment(JTextField.RIGHT);
//        display.setEditable(false);
//        display.setFont(new Font("Arial", Font.PLAIN, 36));
//        panel.add(display, BorderLayout.NORTH);
//
//        // 버튼 패널
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
//
//        // 숫자 버튼 생성
//        numberButtons = new JButton[10];
//        for (int i = 0; i < 10; i++) {
//            numberButtons[i] = new JButton(String.valueOf(i));
//            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 24));
//            buttonPanel.add(numberButtons[i]);
//        }
//
//        // 연산 버튼 생성
//        addButton = new JButton("+");
//        subButton = new JButton("-");
//        mulButton = new JButton("*");
//        divButton = new JButton("/");
//
//        eqButton = new JButton("=");
//        clrButton = new JButton("C");
//
//        addButton.setFont(new Font("Arial", Font.PLAIN, 24));
//        subButton.setFont(new Font("Arial", Font.PLAIN, 24));
//        mulButton.setFont(new Font("Arial", Font.PLAIN, 24));
//        divButton.setFont(new Font("Arial", Font.PLAIN, 24));
//        eqButton.setFont(new Font("Arial", Font.PLAIN, 24));
//        clrButton.setFont(new Font("Arial", Font.PLAIN, 24));
//
//        //button.addActionListener(new MyFrame.Calc());
//        // 연산 버튼 패널에 추가
//        buttonPanel.add(addButton);
//        buttonPanel.add(subButton);
//        buttonPanel.add(mulButton);
//        buttonPanel.add(divButton);
//        buttonPanel.add(eqButton);
//        buttonPanel.add(clrButton);
//
//        // 패널 추가
//        panel.add(buttonPanel, BorderLayout.CENTER);
//        this.add(panel);
//
//        this.setVisible(true);
//    }
//
//    private class Calc implements ActionListener{
//
//    }
//
//    public static void main(String[] args) {
//        new Cal();
//    }
//}