package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LineDraw extends JPanel implements MouseListener {
    int x1, x2, y1, y2;


    @Override
    public void mouseClicked(MouseEvent e) {}

    //x값 받기
    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    //y받기
    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public LineDraw(){
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(x1, y1, x2, y2); // 선 그리기
    }

    static class Liner extends JFrame{
        public Liner() {
            setTitle("선 그리기");
            add(new LineDraw());
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 동작 설정
            setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Liner();
    }
}
