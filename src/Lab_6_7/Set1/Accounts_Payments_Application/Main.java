package Lab_6_7.Set1.Accounts_Payments_Application;

public class Main {
    public static void main(String[] args) {

        var invoice = new Invoice("745", "A Tool With Faster Response Time", 4, 199.99);
        var employee = new SalariedEmployee("Abhinand", "Arun", "20201", 20000);

        System.out.println("Payment Amount : ₹" + invoice.getPaymentAmount());
        invoice.display();
        System.out.println();
        System.out.println("Payment Amount : ₹" + employee.getPaymentAmount());
        employee.display();

    }
}
