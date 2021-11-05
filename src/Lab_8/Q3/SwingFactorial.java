package Lab_8.Q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Factorial_Calculator extends Frame implements ActionListener {
    private final JTextField TextField1;
    private final JTextField TextField2;
    private final int n = 0;


    public Factorial_Calculator () {
        setLayout(new FlowLayout());
        JLabel label_count1 = new JLabel("N: ");
        add(label_count1);
        TextField1 = new JTextField(n + "", 10);
        TextField1.setEditable(true);
        add(TextField1);

        JLabel label_count2 = new JLabel("Factorial: ");
        add(label_count2);
        int factorial = 0;

        TextField2 = new JTextField(factorial + "", 10);
        TextField2.setEditable(false);
        add(TextField2);

        JButton button_count = new JButton("Calculate");
        add(button_count);
        button_count.addActionListener(this);

        setSize(600, 100);
        setTitle("Factorial Calculator");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int num = Integer.parseInt(TextField1.getText());
        int Fact = 1;
        for(int i=1;i<= num;i++){
            Fact= Fact*i;
        }

        TextField1.setText("");
        TextField2.setText(Fact + "");
    }
}

public class SwingFactorial {
    public static void main(String[] args) {
        new Factorial_Calculator();
    }
}