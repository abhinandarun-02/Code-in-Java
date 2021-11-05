package Lab_4.q3;

public class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[]{0, 0, 0};
    private char[] grade;

    Student() {
        rollNo = 0;
        name = "";
        grade = new char[]{'F', 'F', 'F'};
    }

    Student(int R, String S, int[] mark) {
        rollNo = R;
        name = S;
        marks[0] = mark[0];
        marks[1] = mark[1];
        marks[2] = mark[2];
        grade = new char[]{'F', 'F', 'F'};


    }

    void setData(int R, String S, int[] marks) {
        rollNo = R;
        name = S;
        this.marks = marks;
    }

    void ShowData() {
        System.out.println("Roll No = " + rollNo + "  " + " Student Name = " + name);
        System.out.println("\nMarks in Physics: " + marks[0] + "\nMarks in Chemistry: " + marks[1] + "\nMarks in Maths: " + marks[2] + "\n");
        System.out.println("Grade in Physics: " + grade[0] + "\nGrade in Chemistry: " + grade[1] + "\nGrade in Maths: " + grade[2] + "\n");
    }

    static Student[]
    Sort(Student[] S) {
        //Sort Method -> Insertion Sort
        Student key;
        int j;
        for (int i = 1; i < S.length; i++) {
            key = S[i];
            j = i - 1;
            while (j >= 0 && S[j].rollNo > key.rollNo) {
                S[j + 1] = S[j];
                j = j - 1;
            }
            S[j + 1] = key;
        }
        return S;
    }

    void assignGrade() {
        int mark;
        char g;
        for (int i = 0; i < 3; i++) {
            mark = this.marks[i];
            if (mark >= 90) {
                g = 'A';
            } else if (mark >= 80) {
                g = 'B';
            } else if (mark >= 70) {
                g = 'C';
            } else if (mark >= 60) {
                g = 'D';
            } else if (mark >= 50) {
                g = 'P';
            } else {
                g = 'F';
            }
            grade[i] = g;
        }
    }
}
