package mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class midterm extends JFrame implements ActionListener{
    private JPanel pannel;
    private JTextField txt;

    public midterm(){
        txt = new JTextField(20);
        add(txt, BorderLayout.NORTH);
        pannel = new JPanel();
        pannel.setLayout(new GridLayout(3,3));
        add(pannel, BorderLayout.CENTER);
        for(int i=1; i<=9; i++) {
            JButton btn = new JButton(""+ i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100,200));
            pannel.add(btn);
        }
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommend = e.getActionCommand();
        txt.setText(txt.getText()+actionCommend);
    }

    public static void main(String[] args) {
        new midterm();
    }
}
