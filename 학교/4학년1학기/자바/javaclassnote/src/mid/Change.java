package mid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Change extends JFrame {
    private JButton button1, button2;
    private JPanel panel;
    public Change(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("배경색 변경");

        panel = new JPanel();
        button1 = new JButton("yellow");
        button2 = new JButton("red");

    }


    class Color extends JFrame implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
