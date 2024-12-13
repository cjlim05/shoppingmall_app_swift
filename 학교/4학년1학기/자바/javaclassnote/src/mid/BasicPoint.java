package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BasicPoint {
    public static void main(String[] args) {
        JFrame f = new JFrame("그래픽 기초 프로그래밍");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.setSize(300, 200);
        f.setVisible(true);}
}
class MyPanel extends JPanel {
    private int squareX = 50;
    private int squareY = 50;
    private int squareW = 20;
    private int squareH = 20;

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        // 마우스 클릭 시 사각형 이동
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(), e.getY());
            }
        });
        // 마우스 드래그 시 사각형 이동
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                moveSquare(e.getX(), e.getY());
            }
        });
    }
    // 사각형 이동 메서드
    private void moveSquare(int x, int y) {
        int OFFSET = 1;
        if ((squareX != x) || (squareY != y)) {
            // 이전 위치 지우기
            //repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
            squareX = x;
            squareY = y;
            // 새로운 위치 그리기
            repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);}}

    // 사각형을 그리는 메서드
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(squareX, squareY, squareW, squareH);
        g.setColor(Color.BLACK);
        g.drawRect(squareX, squareY, squareW, squareH);}
}
