package Lab_2;

import java.io.*;

class OddAndEven {
    public OddAndEven() {
    }

    int n;
    private int countOfOdd = 0, countOfEven = 0;

    public void addNumber() {
        if (n % 2 == 0)
            countOfEven++;
        else
            countOfOdd++;
    }

    public String toString() {
        return ("Number of odd: " + countOfOdd + "\nNumber of even: " + countOfEven);
    }
}

public class q4 {
    public static void main(String[] args) throws IOException {
        OddAndEven input = new OddAndEven();
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number or q to stop: ");
        String s = stdin.readLine();
        input.n = Integer.parseInt(s);
        while (!(s.equalsIgnoreCase("q"))) {
            input.n = Integer.parseInt(s);
            input.addNumber();
            System.out.println("Enter next number or q to stop: ");
            s = stdin.readLine();
        }
        System.out.println(input);
    }
}