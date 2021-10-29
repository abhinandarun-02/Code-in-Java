package Lab_5.Part_2.Q1;

public class Main {

    public static void main(String[] args) {

        var stud1 = new A(89, 81, 91);
        var stud2 = new B(80, 75, 96, 83);

        System.out.println("The Percentage of Student A is " + stud1.get_percentage() + "%");
        System.out.println("The Percentage of Student B is " + stud2.get_percentage() + "%");


    }
}
