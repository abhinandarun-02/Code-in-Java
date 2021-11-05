package Lab_6_7.Set2.Q4;

import java.util.Scanner;

public class Main {

    public static void productCheck(int weight) throws myException {
        if (weight < 100)
            throw new myException("Weight Should be Greater than 100");
        else {
            System.out.println("Successfully Checked!!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();

        try {
            productCheck(weight);
        } catch (myException ex) {
            System.out.println("Exception Caught");
            System.out.println(ex.getMessage());
        }

    }
}
