//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//
//class Point{
//    int x, y;
//}
//public class draw extends JPanel implements MouseMotionListener {
//    private int index = 0;
//    Point[] array = new Point[100];
//
//    public draw(){
//        this.addMouseMotionListener(this);
//    }
//    @Override
//    public void mouseDragged(MouseEvent e) {
//        int x = e.getX();
//        int y = e.getY();
//        if(index > 10000)
//            return;
//        array[index] = new Point();
//        array[index].x = e.getX();
//        array[index].y = e.getY();
//        index++;
//        repaint();
//    }
//
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        for(Point p : array)
//            if(p != null)
//                g.drawRect(p.x, p.y, 1, 1);
//    }
//    @Override
//    public void mouseMoved(MouseEvent e) {  }
//}
//class Scribble extends JFrame{
//    public Scribble() {
//        setSize(300,300);
//        setTitle("마우스로 그림 그리기");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        add(new draw());
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        Scribble s = new Scribble();
//    }
//}
