package Lab_8.Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Counter extends Frame implements ActionListener {
    private final JTextField TextField;
    private final JButton button_count_up,button_count_down,button_count_reset;
    private int count = 0;

    public Counter () {
        setLayout(new FlowLayout());
        JLabel label_count = new JLabel("Counter: ");
        add(label_count);

        TextField = new JTextField(count + "", 10);
        TextField.setEditable(false);
        add(TextField);

        button_count_up = new JButton("Count Up");
        add(button_count_up);
        button_count_up.addActionListener(this);

        button_count_down = new JButton("Count Down");
        add(button_count_down);
        button_count_down.addActionListener(this);

        button_count_reset = new JButton("Reset");
        add(button_count_reset);
        button_count_reset.addActionListener(this);

        setSize(500, 100);
        setTitle("Counter App");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

        if(evt.getSource()==button_count_up){
            ++count;
        }else if(evt.getSource()==button_count_down){
           --count;
        }else if(evt.getSource()==button_count_reset){
            count = 0;
        }
        TextField.setText(count + "");
    }
}

public class SwingCounterButtons {
    public static void main(String[] args) {
        new Counter();
    }
}