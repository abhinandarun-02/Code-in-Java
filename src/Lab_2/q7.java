package Lab_2;

import java.util.Scanner;

class animal {
    int cat_A, cat_B, mouse;

    void catAndMouse() {
        if (Math.abs(cat_A - mouse) < Math.abs(cat_B - mouse)) {
            System.out.print("Cat A");
        } else if (Math.abs(cat_B - mouse) < Math.abs(cat_A - mouse)) {
            System.out.print("Cat B");
        } else {
            System.out.print("Mouse C");
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        animal demo = new animal();
        demo.cat_A = s.nextInt();
        demo.cat_B = s.nextInt();
        demo.mouse = s.nextInt();
        demo.catAndMouse();
    }
}