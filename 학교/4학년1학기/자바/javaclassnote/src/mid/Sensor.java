package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Sensor extends JPanel {

    private Color circleColor1 = Color.BLACK; // 첫 번째 원
    private Color circleColor2 = Color.BLACK; // 두 번째 원
    private Color circleColor3 = Color.BLACK; // 세 번째 원

    public class Sensorbord extends JPanel implements MouseListener, MouseMotionListener {
        public Sensorbord() {
            addMouseListener(this);
            addMouseMotionListener(this); // MouseMotionListener 추가
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            // 원 밖으로 나가면 색상 초기화
            circleColor1 = Color.BLACK;
            circleColor2 = Color.BLACK;
            circleColor3 = Color.BLACK;
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // 마우스가 움직일 때마다 색상 업데이트
            if (isMouseInsideCircle(e.getX(), e.getY(), 100, 100)) {
                circleColor1 = Color.RED; // 첫 번째 원 색상 변경
            } else if (isMouseInsideCircle(e.getX(), e.getY(), 100, 200)) {
                circleColor2 = Color.RED; // 두 번째 원 색상 변경
            } else if (isMouseInsideCircle(e.getX(), e.getY(), 100, 300)) {
                circleColor3 = Color.RED; // 세 번째 원 색상 변경
            } else {
                // 원 밖에 있을 때 색상 초기화
                circleColor1 = Color.BLACK;
                circleColor2 = Color.BLACK;
                circleColor3 = Color.BLACK;
            }
            repaint(); // 패널 다시 그리기
        }

        private boolean isMouseInsideCircle(int mouseX, int mouseY, int centerX, int centerY) {
            // 원의 경계 안에 있는지 확인
            int radius = 50; // 원의 반지름
            return (Math.pow(mouseX - centerX, 2) + Math.pow(mouseY - centerY, 2) <= Math.pow(radius, 2));
        }

        @Override
        public void mouseDragged(MouseEvent e) {}
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(circleColor1);
        g.fillOval(100, 100, 100, 100); // 첫 번째 원
        g.setColor(circleColor2);
        g.fillOval(100, 200, 100, 100); // 두 번째 원
        g.setColor(circleColor3);
        g.fillOval(100, 300, 100, 100); // 세 번째 원
    }

    public Sensor() {
        add(new Sensorbord());
        setSize(300, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Sensor());
        frame.setSize(300, 500);
        frame.setVisible(true);
    }
}
