package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private double result = 0;
    private String operator = "";
    private boolean startNewNumber = true;
    private boolean calc = true;
    private StringBuilder equation = new StringBuilder(); // 수식을 저장할 변수

    public Calculator() {
        this.setTitle("계산기");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 화면 디스플레이
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        this.add(display, BorderLayout.NORTH);

        // 버튼 패널
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 0)); // 4x4 버튼 레이아웃

        // 숫자 버튼 추가
        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "",
                "0", "=", "C", ""
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    // 버튼 클릭 이벤트 처리
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // 숫자 버튼 클릭 시
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                if (startNewNumber) {
                    display.setText(command);
                    equation.append(command); // 수식에 숫자 추가
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + command);
                    equation.append(command); // 수식에 숫자 추가
                }
            }

            // 연산자 처리
            else if (command.equals("+") || command.equals("-")) {
                calc = false; //연산자 입력 확인
                if (!startNewNumber) {
                    result = Double.parseDouble(display.getText());
                    operator = command;
                    equation.append(" " + operator + " "); // 수식에 연산자 추가
                    display.setText(equation.toString()); // 수식 표시
                    startNewNumber = true; //두번째 입력값 받기 전 상태
                }
            }

            // '=' 버튼 클릭 시 결과 계산
            else if (command.equals("=")) {
                if (startNewNumber||calc) {
                    // 두 번째 값이 입력되지 않은 경우
                    display.setText("error"); // 오류 메시지 표시
                } else if (!operator.isEmpty()) {
                    double secondOperand = Double.parseDouble(display.getText());
                    switch (operator) {
                        case "+":
                            result += secondOperand;
                            break;
                        case "-":
                            result -= secondOperand;
                            break;
                    }
                    equation.append(" = " + result); // 수식에 결과 추가
                    display.setText(equation.toString()); // 전체 수식과 결과 표시
                    startNewNumber = true;
                    operator = ""; // 연산자 초기화
                }
            }

            // 'C' 버튼 클릭 시 초기화
            else if (command.equals("C")) {
                result = 0;
                operator = "";
                equation.setLength(0); // 수식 초기화
                display.setText("");
                startNewNumber = true;
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
