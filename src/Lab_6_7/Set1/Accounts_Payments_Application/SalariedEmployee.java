package Lab_6_7.Set1.Accounts_Payments_Application;

public class SalariedEmployee extends Employee {

    private double weekly_salary;
    private final int no_of_weeks = 4;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekly_salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weekly_salary = weekly_salary;
    }

    public double getWeekly_salary() {
        return weekly_salary;
    }

    public void setWeekly_salary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }



    @Override
    public double getPaymentAmount() {
        return no_of_weeks * weekly_salary;
    }

    public void display() {
        super.display();
        System.out.println("Weekly Salary : ₹" + weekly_salary);
        System.out.println("No of Weeks  : " + no_of_weeks);
    }
}
