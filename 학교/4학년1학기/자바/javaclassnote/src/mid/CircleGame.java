package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CircleGame extends JFrame implements ActionListener, MouseListener {
    private JButton restartButton;
    private ArrayList<Point> circlePositions;  // 원의 위치 저장
    private ArrayList<Integer> correctOrder;   // 클릭해야 할 순서 (1, 2, 3)
    private ArrayList<Integer> userOrder;      // 사용자가 클릭한 순서
    private JLabel resultLabel;

    public CircleGame() {
        setTitle("Circle Order Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Restart 버튼 및 결과 레이블 설정
        restartButton = new JButton("Restart");
        restartButton.addActionListener(this);
        resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 32));  // 글자 크기 변경

        // 게임 패널 설정
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBackground(Color.WHITE);
        gamePanel.addMouseListener(this);

        add(restartButton, BorderLayout.NORTH);
        add(gamePanel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        circlePositions = new ArrayList<>();
        correctOrder = new ArrayList<>();
        userOrder = new ArrayList<>();

        generateCircles();  // 처음 원 위치 설정

        setVisible(true);
    }

    private void generateCircles() {
        circlePositions.clear();
        userOrder.clear();  // 사용자 클릭 순서 초기화
        resultLabel.setText(" ");  // 메시지 초기화
        correctOrder.clear();  // 올바른 클릭 순서 초기화

        // 원의 랜덤 위치 생성
        for (int i = 1; i <= 3; i++) {
            int x = (int) (Math.random() * 300) + 50;
            int y = (int) (Math.random() * 300) + 50;
            circlePositions.add(new Point(x, y));
            correctOrder.add(i); // 클릭해야 할 순서 저장 (1, 2, 3)
        }
        repaint(); // 화면 갱신
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == restartButton) {
            generateCircles(); // 게임 재시작
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < circlePositions.size(); i++) {
            Point p = circlePositions.get(i);
            // 원의 클릭 범위 확인
            if (e.getX() >= p.x - 30 && e.getX() <= p.x + 30 && e.getY() >= p.y - 30 && e.getY() <= p.y + 30) {
                userOrder.add(i + 1);  // 클릭 순서 저장
                // 클릭한 순서와 올바른 순서 비교
                if (userOrder.size() == correctOrder.size()) {
                    if (userOrder.equals(correctOrder)) {
                        resultLabel.setText("Success");
                    } else {
                        resultLabel.setText("Fail");
                    }
                    userOrder.clear();  // 다음 라운드를 위해 초기화
                }
                repaint();
                break;
            }
        }
    }

    // 다른 MouseListener 메소드
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font("Serif", Font.BOLD, 20));
            for (int i = 0; i < circlePositions.size(); i++) {
                Point p = circlePositions.get(i);
                g.setColor(Color.LIGHT_GRAY);
                g.fillOval(p.x - 30, p.y - 30, 60, 60);  // 원 그리기
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(i + 1), p.x - 7, p.y + 7);  // 원에 번호 표시
            }
        }
    }

    public static void main(String[] args) {
        new CircleGame(); // 게임 시작
    }
}
