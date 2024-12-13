package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triplegame extends JFrame {
    private JTextField inputField; // 입력 필드
    private JButton submitButton; // 제출 버튼
    private JLabel displayLabel; // 입력 값을 표시할 레이블

    public Triplegame() {
        // 프레임 설정
        setTitle("Triple Game");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 결과 표시 레이블 생성
        displayLabel = new JLabel("입력 값을 여기서 확인하세요.", SwingConstants.CENTER);
        add(displayLabel, BorderLayout.NORTH); // 상단에 레이블 추가

        // 패널 생성 및 레이아웃 설정
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        // 입력 필드 생성
        inputField = new JTextField(10);
        inputPanel.add(inputField);

        // 제출 버튼 생성
        submitButton = new JButton("Submit");
        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.SOUTH); // 하단에 입력 패널 추가

        // 버튼 클릭 이벤트 처리
        submitButton.addActionListener(new InputHandler()); // InputHandler 사용

        // 프레임 보이기
        setVisible(true);
    }

    // 내부 private 클래스 정의
    private class InputHandler implements ActionListener {

        String[] answer = {"1", "2", "짝", "4", "5", "짝", "7", "8", "짝", "10", "11", "12", "짝", "14", "15", "짝", "17", "18", "짝", "20"};
        private int submitCount = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputValue = inputField.getText(); // 입력 값 가져오기

            if(inputValue.equals(answer[submitCount])){
                if(inputValue.equals("20")|| answer[submitCount+1].equals("20")){
                    displayLabel.setText("비겼습니다.");
                }
                else{
                    displayLabel.setText(displayLabel.getText() + " " + inputValue + " " + answer[submitCount+1]);
                    inputField.setText(""); // 입력 필드 초기화
                }
            }
            else{
                displayLabel.setText("you lose");
            }



            submitCount+=2;

        }
    }

    public static void main(String[] args) {
        new Triplegame();
    }
}
