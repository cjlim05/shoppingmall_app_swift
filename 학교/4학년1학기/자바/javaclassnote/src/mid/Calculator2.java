package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField txt;
    private String operator; // 연산자 저장
    private double firstNum, secondNum; // 연산에 사용할 숫자 저장

    public Calculator2() {
        txt = new JTextField(20);
        txt.setEditable(false); // 텍스트 필드를 읽기 전용으로 설정
        add(txt, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); // 4x4 그리드로 확장
        add(panel, BorderLayout.CENTER);

        // 숫자 버튼 추가
        for (int i = 1; i <= 9; i++) {
            addButton(String.valueOf(i));
        }
        addButton("0");

        // 연산 버튼 추가
        addButton("+");
        addButton("-");
        addButton("*");
        addButton("/");
        addButton("="); // 결과 버튼
        addButton("C"); // 초기화 버튼

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addButton(String label) {
        JButton btn = new JButton(label);
        btn.addActionListener(this);
        panel.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        switch (input) {
            case "C":
                txt.setText("");
                operator = null;
                firstNum = 0;
                secondNum = 0;
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = input; // 연산자를 저장
                firstNum = Double.parseDouble(txt.getText()); // 첫 번째 숫자 저장
                txt.setText(""); // 화면 초기화
                break;
            case "=":
                secondNum = Double.parseDouble(txt.getText()); // 두 번째 숫자 저장
                calculateResult(); // 결과 계산
                break;
            default: // 숫자 입력
                txt.setText(txt.getText() + input);
                break;
        }
    }

    private void calculateResult() {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                } else {
                    txt.setText("Error");
                    return;
                }
                break;
        }
        txt.setText(String.valueOf(result));
        operator = null; // 연산자 초기화
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
