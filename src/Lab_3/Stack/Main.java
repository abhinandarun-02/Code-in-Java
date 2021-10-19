package Lab_3.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var s = new Stack();
        int choice;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("\nStack Implementation");
        System.out.println("MAX SIZE OF STACK = 100");

        do {
            System.out.println("\n1. Insert    2. Display    3. Delete      4. Peep");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Any Integer :  ");
                    number = input.nextInt();
                    s.insert(number);
                }
                case 2 -> s.displaydeck();
                case 3 -> s.delete();
                case 4 -> s.peep();
                default -> System.out.println("Wrong Choice");
            }

            System.out.println("\nDo you want to exit the program ? (Yes->1 || No->0)");
            choice = input.nextInt();
        } while (choice != 1);
        input.close();
    }
}
