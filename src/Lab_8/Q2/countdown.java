package Lab_8.Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class down_Counter extends Frame implements ActionListener {
    private final JTextField TextField;
    private int count = 88;

    public down_Counter () {
        setLayout(new FlowLayout());
        JLabel label_count = new JLabel("Counter: ");
        add(label_count);

        TextField = new JTextField(count + "", 10);
        TextField.setEditable(true);
        add(TextField);

        JButton button_count = new JButton("Count down");
        add(button_count);
        button_count.addActionListener(this);

        setSize(300, 100);
        setTitle("Countdown App");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        count--;
        TextField.setText(count + "");
    }
}

public class countdown {
    public static void main(String[] args) {
        new down_Counter();
    }
}