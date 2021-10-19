package Lab_2;

import java.util.Scanner;

class person {
    private String name;

    void getName() {
        System.out.println("Hello " + name);
    }

    void setName(String value) {
        name = value;
    }
}

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        person p1 = new person();
        String name = sc.nextLine();

        p1.setName(name);
        p1.getName();

        sc.close();
    }
}