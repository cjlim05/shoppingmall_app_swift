package mid;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MovingCar extends JPanel {
    BufferedImage img = null;
    int img_x =0, img_y = 0;
    public MovingCar(){
        try{
            img = ImageIO.read(new File(""));
        } catch (IOException e){
            System.out.println("no image");System.exit(1);
        }
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                repaint();
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,img_x,img_y,null);
    }
}
class NewFrame extends JFrame{
    public NewFrame() {
        add(new MovingCar());
        setSize(300, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new NewFrame();
    }
}
