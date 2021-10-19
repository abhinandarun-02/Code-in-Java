package Lab_2;

class Employee {
    long id;
    String name;
    float salary;

    Employee(String formname, float formsalary) {
        name = formname;
        salary = formsalary;
    }

    void getData() {
        System.out.println("Name : " + name);
        System.out.print("Salary : " + salary);
    }

    void raiseSalary(int byPercent) {
        salary += (salary / byPercent);
    }
}

public class q6 {
    public static void main(String[] args) {
        Employee harry = new Employee("James", (float) 75000);
        harry.raiseSalary(10);
        harry.getData();
    }
}