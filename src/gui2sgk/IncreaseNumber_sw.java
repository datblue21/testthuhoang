package gui2sgk;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class IncreaseNumber_sw extends JFrame implements ActionListener {
    JButton bt;
    JTextField tf;
    int counter = 0;
    public IncreaseNumber_sw()
    {
        bt = new JButton("increase");
        bt.addActionListener(this);
        tf = new JTextField("0");
        tf = new JTextField("0");
        Container cont = this.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.setSize(800,600);
        cont.add(bt);
        cont.add(tf);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent  event) {
        counter++;
        tf.setText(String.valueOf(counter));
    }
    public static void main(String args[]){
        new IncreaseNumber_sw();
    }
}