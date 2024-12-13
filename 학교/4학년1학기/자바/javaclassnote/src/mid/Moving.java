package mid;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Motion extends JPanel {
    BufferedImage img = null;
    int img_x = 100, img_y = 100;

    public Motion() {
        try {
            img = ImageIO.read(new File("/Users/chaeju/Downloads/converted_image.png"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode) {
                    case KeyEvent.VK_UP: img_y -= 10;break;
                    case KeyEvent.VK_DOWN: img_y += 10;break;
                    case KeyEvent.VK_LEFT: img_x -= 10;break;
                    case KeyEvent.VK_RIGHT: img_x += 10;break;
                }repaint();}
            @Override
            public void keyReleased(KeyEvent e) {   }
            @Override
            public void keyTyped(KeyEvent arg0) {   }
        });
        this.requestFocus();
        setFocusable(true);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
    public class Moving extends JFrame{
        public Moving(){
            setSize(300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(new Motion());
            setVisible(true);
        }
        public static void main(String[] args) {
            Moving s = new Moving();
        }
}
