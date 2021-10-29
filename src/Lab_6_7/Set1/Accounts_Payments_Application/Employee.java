package Lab_6_7.Set1.Accounts_Payments_Application;

public abstract class Employee implements Payable {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public abstract double getPaymentAmount();

    public void display() {
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Security No : " + socialSecurityNumber);
    }
}
