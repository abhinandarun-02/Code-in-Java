// Name    : Abhinand Arun
// Roll No : AM.EN.U4CSE20201

package U4CSE20201;

import java.util.Scanner;

public class U4CSE20201_abhinand_Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N :");
        int N = sc.nextInt();

        System.out.println("Current Thread: " + Thread.currentThread().getName());
        U4CSE20201_abhinand_OblongNums T1 = new U4CSE20201_abhinand_OblongNums("Thread-1", N);
        T1.start();

        try {
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current Thread: " + Thread.currentThread().getName());
        U4CSE20201_abhinand_Oblong5 T2 = new U4CSE20201_abhinand_Oblong5("Thread-2", N);
        T2.start();

        try {
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("... Exit Thread main\n" +
                           "... End of execution");
    }
}
