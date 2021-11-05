package Lab_6_7.Set2.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[]{1,2,3,4,5};
        String index = sc.nextLine();

        try {
            System.out.println(array[Integer.parseInt(index)]);
        } catch (NumberFormatException  ex){
            System.out.println("Cannot be Parsed");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of Bound");
        }
    }
}
