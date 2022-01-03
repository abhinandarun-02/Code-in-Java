package Lab_8_String.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();
        int n = sc.nextInt();

        int[] countArray = new int[26];

        for (int i = 0; i < str.length(); i++) {
            countArray[str.codePointAt(i) - 97]++;
        }

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean flag = false;

            for (int j = 0; j < 26; j++) {
                for (int k = 1; countArray[j] != 0 && k <= countArray[j]; k++) {
                    if ((j + 1) * k == x) {
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (!flag) System.out.println("NO");
        }
    }
}

