package Lab_4.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        number num = new number();
        int choice;
        do {
            System.out.print("Choose Addition Type:\n1. Floating Point numbers\t2. Complex Numbers\t 3.Vector Addition\nChoice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    float a, b;
                    System.out.print("Enter two Numbers : ");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    num.Add(a, b);
                }
                case 2 -> {
                    double r1, r2, c1, c2;
                    System.out.print("Enter Real part : ");
                    r1 = input.nextDouble();
                    System.out.print("Enter Complex part i : ");
                    c1 = input.nextDouble();
                    System.out.print("Enter Real part : ");
                    r2 = input.nextDouble();
                    System.out.print("Number 2: Enter Complex part i : ");
                    c2 = input.nextDouble();
                    num.Add(r1, c1, r2, c2);
                }
                case 3 -> {
                    float u1, u2, v1, v2;
                    System.out.println("Enter data as instructed ");
                    System.out.print("Enter X Co-ordinate : ");
                    u1 = input.nextFloat();
                    System.out.print("Enter Y Co-ordinate: ");
                    v1 = input.nextFloat();
                    System.out.print("\nEnter X Co-ordinate : ");
                    u2 = input.nextFloat();
                    System.out.print("Enter Y Co-ordinate: ");
                    v2 = input.nextFloat();
                    num.Add(u1, v1, u2, v2);
                }
                default -> System.out.println("Wrong Input Choice");
            }
            System.out.print("Yes->1 / No->0\nChoice: ");
            choice = input.nextInt();
        }
        while (choice != 0);
        input.close();
    }
}
