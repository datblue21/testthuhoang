package gui1sgk;

import java.awt.*;
import java.awt.event.*;

public class IncreaseNumber extends Frame implements ActionListener {
    Button bt;
    TextField tf;

    int counter = 0;

    public IncreaseNumber() {

        bt = new Button("increase");
        bt.addActionListener(this);

        tf = new TextField("0");

        setLayout(new FlowLayout());
        add(bt);
        add(tf);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        counter++;
        tf.setText(String.valueOf(counter));
    }
    public static void main(String[] args){
        new IncreaseNumber();
    }
}
