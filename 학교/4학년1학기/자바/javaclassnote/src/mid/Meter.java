package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meter extends JFrame implements ActionListener {
    JTextField meter, inches;
    JPanel panel;
    JLabel meterinttro, inchintro;

    float result;

    JButton btn;

    public Meter(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1)); // 레이아웃을 그리드로 설정하여 구성 요소를 순서대로 배치

        meterinttro = new JLabel("센티미터를 입력해주세요");
        meter = new JTextField(10); // 입력 필드의 크기를 설정
        btn = new JButton("환산하기");
        btn.addActionListener(this);

        inchintro = new JLabel("결과입니다");
        inches = new JTextField(10);
        inches.setEditable(false); // 결과 필드를 읽기 전용으로 설정

        panel.add(meterinttro);
        panel.add(meter);
        panel.add(btn);
        panel.add(inchintro);
        panel.add(inches);

        add(panel); // JFrame에 panel 추가

        setTitle("센티미터 -> 인치 변환기");
        setSize(300, 200); // 창 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 활성화
        setLocationRelativeTo(null); // 창을 화면 가운데에 배치
        setVisible(true); // 창을 표시
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            float meterValue = Float.parseFloat(meter.getText()); // 텍스트를 float로 변환
            result = meterValue * 0.393701f; // 인치로 변환 (1cm = 0.393701 inch)
            inches.setText(String.valueOf(result)); // float 값을 문자열로 변환하여 텍스트 필드에 설정
        } catch (NumberFormatException ex) {
            inches.setText("숫자를 입력해주세요"); // 숫자가 아닌 경우 오류 메시지 표시
        }
    }

    public static void main(String[] args) {
        Meter m = new Meter();
    }
}
