package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class NumberGame extends JFrame implements ActionListener {
    private JButton[] numberButtons = new JButton[3];
    private JButton retryButton, checkButton;
    private JLabel resultLabel; // 결과 메시지를 표시할 JLabel
    private ArrayList<Integer> correctOrder;
    private ArrayList<Integer> userOrder;

    public NumberGame() {
        setTitle("Number Button Game");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the buttons and add to frame
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton();
            numberButtons[i].addActionListener(this);
            add(numberButtons[i]);
        }

        // Retry and Check buttons
        retryButton = new JButton("다시하기");
        checkButton = new JButton("확인하기");
        retryButton.addActionListener(this);
        checkButton.addActionListener(this);

        add(retryButton);
        add(checkButton);

        // 결과 메시지를 표시할 JLabel 추가
        resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Serif", Font.BOLD, 16));
        add(resultLabel);

        // Initialize orders
        correctOrder = new ArrayList<>();
        userOrder = new ArrayList<>();

        randomizeNumbers();  // Set initial numbers to buttons

        setVisible(true);
    }

    private void randomizeNumbers() {
        correctOrder.clear();
        userOrder.clear();
        resultLabel.setText(" ");  // 결과 메시지 초기화

        // Generate numbers 1 to 3 in random order
        for (int i = 1; i <= 3; i++) {
            correctOrder.add(i);
        }
        Collections.shuffle(correctOrder);

        // Assign numbers to buttons
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i].setText(correctOrder.get(i).toString());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == retryButton) {
            randomizeNumbers();
        } else if (e.getSource() == checkButton) {
            // Check if the user clicked the buttons in 1, 2, 3 order
            ArrayList<Integer> correctSequence = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                correctSequence.add(i);
            }

            if (userOrder.equals(correctSequence)) {
                resultLabel.setText("성공");
            } else {
                resultLabel.setText("실패");
            }
            userOrder.clear();
        } else {
            // If a number button is clicked, add to user order
            JButton clickedButton = (JButton) e.getSource();
            userOrder.add(Integer.parseInt(clickedButton.getText()));
        }
    }

    public static void main(String[] args) {
        new NumberGame();
    }
}
