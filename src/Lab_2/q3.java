package Lab_2;

import java.util.Scanner;

class Complex {
    float r1, i1, r2, i2;

    Complex() {
        r1 = 5.1f;
        i1 = 6.2f;
    }

    Complex(float a, float b) {
        r2 = a;
        i2 = b;
    }

    public void add() {
        System.out.print("After adding complex no. = " + (r1 + r2) + "+i" + (i1 + i2) + '\n');
    }

    public void sub() {
        System.out.print("After subtracting complex no. = " + (r2 - r1) + "+i" + (i2 - i1));
    }
}

public class q3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your complex number in the form a+ib :");
        String st = s.nextLine();

        float a = Float.parseFloat(st.substring(0, 1));
        float b = Float.parseFloat(st.substring(3, 4));

        Complex num = new Complex(a, b);
        num.add();
        num.sub();
    }
}