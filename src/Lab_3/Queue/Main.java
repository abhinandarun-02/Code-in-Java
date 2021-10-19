package Lab_3.Queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var q = new Queue();
        int choice;
        int data;

        Scanner input = new Scanner(System.in);

        System.out.println("\nCAR SERVICE CENTER\nMAX SIZE OF queue = 100");

        do {
            System.out.println("\n1. Register    2. Display    3. Delete      4. Who's Next");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Any Number : ");
                    data = input.nextInt();
                    q.register(data);
                }
                case 2 -> q.displayqueue();
                case 3 -> q.delete();
                case 4 -> q.whonext();
                default -> System.out.println("Invalid Choice");
            }
            System.out.println("\nDo you want to exit the program ? (Yes->1 | No->0)");
            choice = input.nextInt();
        } while (choice != 1);
        input.close();
    }
}
