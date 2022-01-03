package Lab_9;

import java.util.Scanner;

class newThread extends Thread {
    int num;

    public newThread(int n) {
        this.num = n;
        start();
    }

    public void run() {
        try {

            for (int i = 1; i <= num; i += 2) {
                Thread.sleep(100);
                System.out.print(i + " ");
            }
        } catch (InterruptedException e) {
            System.out.println("Second Thread Interuppted");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter the value of n : ");
        num = scanner.nextInt();

        newThread thread = new newThread(num);

        try {
            Thread.sleep(100);

            for (int i = 2; i <= num; i += 2) {
                Thread.sleep(100);
                System.out.print(i + " ");
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interuppted");
        }

    }
}
