package Set2.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        try{
            int [] array = new int [size];
            System.out.println("Successfully Initialized Array");
        }catch (NegativeArraySizeException ex){
            System.out.println("Array Size Cannot be Negative");
        }

    }
}
