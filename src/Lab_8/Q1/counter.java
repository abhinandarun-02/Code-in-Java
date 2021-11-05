package Lab_8.Q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Forward_Counter extends Frame implements ActionListener {
    private final JTextField TextField;
    private int count = 0;

    public Forward_Counter () {
        setLayout(new FlowLayout());
        JLabel label_count = new JLabel("Counter: ");
        add(label_count);

        TextField = new JTextField(count + "", 10);
        TextField.setEditable(false);
        add(TextField);

        JButton button_count = new JButton("Count");
        add(button_count);
        button_count.addActionListener(this);

        setSize(300, 100);
        setTitle("Counter App");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        TextField.setText(count + "");
    }
}

public class counter {
    public static void main(String[] args) {
        new Forward_Counter();
    }
}