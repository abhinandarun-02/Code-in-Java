package Lab_4.q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter No of students: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] marks = new int[3];
        Student[] myObj = new Student[size];

        int R;
        String S;
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter the next student details");
            System.out.print("Enter the roll number: ");
            R = in.nextInt();
            in.nextLine(); // should get rid of the new line
            System.out.print("Enter Name: ");
            S = in.nextLine();
            System.out.print("Enter the marks of PHY, CHEM, MATH: ");
            marks[0] = in.nextInt();
            marks[1] = in.nextInt();
            marks[2] = in.nextInt();
            myObj[i] = new Student(R, S, marks);
            myObj[i].assignGrade();
        }
        System.out.println("\nDisplay Student Details\n");
        for (int i = 0; i < size; i++) {
            myObj[i].ShowData();
        }
        System.out.println("\nSorting Based on Roll Numbers\n");
        Student.Sort(myObj);
        System.out.println("\nDisplay Student Details\n");
        for (int i = 0; i < size; i++) {
            myObj[i].ShowData();
        }
        in.close();
    }
}