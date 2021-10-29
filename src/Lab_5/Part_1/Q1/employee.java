package Lab_5.Part_1.Q1;

public class employee extends Person{

    private int employee_ID;
    private double hourly_pay;

    employee(String name, int age, int emID, double hpay){
        super(name,age);
        employee_ID = emID;
        hourly_pay = hpay;
    }

    public int getid() {
        return employee_ID;
    }

    public double gethp() {
        return hourly_pay;
    }

    public void setid(int n) {
        employee_ID = n;
    }

    public void sethp(Double n) {
        hourly_pay = n;
    }

    public double raise(){
        double temp = hourly_pay *0.15;
        hourly_pay += temp;
        return hourly_pay;
    }

    public double payday() {
        return 40* hourly_pay;
    }

    public double payday(int n) {
        return 40* hourly_pay + n* hourly_pay *1.5;
    }


    public void to_string() {
        super.to_string();
        System.out.println("Employee ID : "+employee_ID + "\nHourly Pay : " + hourly_pay);
    }

}