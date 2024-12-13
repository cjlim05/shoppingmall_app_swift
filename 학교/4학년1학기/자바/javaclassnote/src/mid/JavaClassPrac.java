package mid;
//9.24
import javax.swing.*;

public class JavaClassPrac extends JFrame {
    public JavaClassPrac() {
//        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("My frame");
//
//        JButton button1 = new JButton("버튼1");
//        this.add(button1);
//
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Image img = kit.getImage("");
//        setIconImage(img);
//
//        setVisible(true);

        JPanel p = new JPanel();
        add(p);
        JLabel l1 = new JLabel("회씨 온도");
        JTextField f1 = new JTextField(15);
        p.add(l1); p.add(f1);

        setSize(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My frame");

        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the JFrame
        new JavaClassPrac();
    }
}
