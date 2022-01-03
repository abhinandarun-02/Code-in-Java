package Lab_8_String.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean flag = true;

        for (int i = 0, j = str.length() - 1; i < str.length() - 1; i++, j--) {
            if (Math.abs(str.codePointAt(i) - str.codePointAt(i + 1)) != Math.abs(str.codePointAt(j) - str.codePointAt(j - 1))) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Funny");
        else System.out.println("Not Funny");
    }
}
