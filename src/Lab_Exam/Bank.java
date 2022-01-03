package Lab_Exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bank {

    static ArrayList<Customer> arrayList;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        arrayList = new ArrayList<>();
        arrayList.add(new Customer("CCC", 103, 3000));
        arrayList.add(new Customer("AAA", 101, 1000));
        arrayList.add(new Customer("BBB", 102, 2000));

        System.out.println("""
                                Please Choose An Option :\s
                                \t 1. Add/Withdraw\s
                                \t 2. Add New Customer\s
                                \t 3. View By Name\s
                                \t 4. View By Account No
                            """);

        System.out.print("Enter Option : ");
        byte choice = sc.nextByte();

        switch (choice) {

            case 1 -> {

                System.out.print(" Enter Account No : ");
                int accountNo = sc.nextInt();
                sc.nextLine();

                System.out.print(" Choose Operation [D/W] : ");
                String operation = sc.nextLine();

                System.out.print(" Enter Amount : ");
                int amount = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    Customer customer = arrayList.get(i);

                    if (customer.accountNo == accountNo) {
                        found = true;
                        if (operation.equals("W")) {
                            customer.setSavings(customer.getSavings() - amount);
                            arrayList.set(i, customer);
                        }
                        else if (operation.equals("D")) {
                            customer.setSavings(customer.getSavings() + amount);
                            arrayList.set(i, customer);
                        }
                        else {
                            System.out.println("Invalid Operation!");
                            break;
                        }

                        System.out.println(customer);
                        System.out.println("Total Balance in the bank: " + totalBankBalance());
                    }
                }
                if (!found) System.out.println("User doesn't exist");

            }


            case 2 -> {

                sc.nextLine();
                System.out.print("Customer Name : ");
                String name = sc.nextLine();

                System.out.print("Account No : ");
                int accountNo = sc.nextInt();

                System.out.print("Savings : ");
                double savings = sc.nextDouble();

                Customer customer = new Customer(name, accountNo, savings);
                arrayList.add(customer);

                System.out.println(customer);
                System.out.println("Total Balance in the bank: " + totalBankBalance());

            }


            case 3 -> {

                System.out.println("Customer Name | Account No | Balance");
                arrayList.sort(new NameComparator());

                for (Customer customer : arrayList)
                    System.out.println(customer.getName() + "\t" + customer.getAccountNo() + "\t" + customer.getSavings());

            }


            case 4 -> {

                System.out.println("Customer Name | Account No | Balance");
                arrayList.sort(new AccountNoComparator());

                for (Customer customer : arrayList)
                    System.out.println(customer.getName() + "\t" + customer.getAccountNo() + "\t" + customer.getSavings());

            }

        }

    }

    static class Customer {

        private final String name;
        private final int accountNo;
        private double savings;

        Customer(String name, int accountNo, double savings) {
            this.accountNo = accountNo;
            this.name = name;
            this.savings = savings;
        }

        public String getName() {
            return name;
        }

        public int getAccountNo() {
            return accountNo;
        }

        public double getSavings() {
            return savings;
        }

        public void setSavings(double savings) {
            this.savings = savings;
        }

        @Override
        public String toString() {
            return
                    "\nCustomer Name : " + name +
                    "\nAccount No : " + accountNo +
                    "\nSavings : " + savings;
        }

    }

    static double totalBankBalance() {
        double sum = 0;
        for (Customer customer : arrayList) sum += customer.savings;
        return sum;
    }

    static class NameComparator implements Comparator<Customer> {
        public int compare(Customer c1, Customer c2) {
            return c1.name.compareTo(c2.name);
        }
    }

    static class AccountNoComparator implements Comparator<Customer> {
        public int compare(Customer c1, Customer c2) {
            return Integer.compare(c2.accountNo, c1.accountNo);
        }
    }

}


