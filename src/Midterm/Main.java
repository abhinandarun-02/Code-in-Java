package Midterm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        Person p1 = new Person();
        p1.setName(sc.nextLine());
        p1.setAge(sc.nextInt());

        try {
            p1.count_vowels();
        } catch (myException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(p1.get_initials());

    }
}
