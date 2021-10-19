package Lab_4.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle twoWheeler = new Vehicle();
        Vehicle heavy = new Vehicle();
        Vehicle medium = new Vehicle();
        Scanner input = new Scanner(System.in);
        int choice, vehicleType;
        do {
            System.out.print("\t\tToll Booth Menu\n1. Paying Vehicle\t2. Non-Paying Vehicle\nChoice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("\t\tPaying Vehicle\n\nChoose Vehicle Type:\n1. Two Wheeler\t2.Medium Vehicle(4 Wheeler)\t3. Heavy Vehicle(4 Wheeler)\nChoice: ");
                    vehicleType = input.nextInt();
                    if (vehicleType == 1) {
                        Vehicle.incrementPaid(vehicleType, twoWheeler);
                    } else if (vehicleType == 2) {
                        Vehicle.incrementPaid(vehicleType, medium);
                    } else if (vehicleType == 3) {
                        Vehicle.incrementPaid(vehicleType, heavy);
                    } else {
                        System.out.println("Invalid Option");
                    }
                }
                case 2 -> {
                    System.out.print("\t\tNon-Paying Vehicle\n\nChoose Vehicle Type:\n1. Two Wheeler\t2.Medium Vehicle(4 Wheeler)\t3. Heavy Vehicle(4 Wheeler)\nChoice: ");
                    vehicleType = input.nextInt();
                    if (vehicleType == 1) {
                        Vehicle.incrementNotPaid(vehicleType, twoWheeler);
                    } else if (vehicleType == 2) {
                        Vehicle.incrementNotPaid(vehicleType, medium);
                    } else if (vehicleType == 3) {
                        Vehicle.incrementNotPaid(vehicleType, heavy);
                    } else {
                        System.out.println("Invalid Option");
                    }
                }
                default -> System.out.println("Invalid Choice");
            }
            System.out.print("Proceed To the Main Menu ? (Yes->1/No->0)\nChoice: ");
            choice = input.nextInt();
        } while (choice != 0);

        double[] paid = new double[3];
        double[] notPaid = new double[3];
        paid[0] = twoWheeler.getVehicleNumPaid();
        paid[1] = medium.getVehicleNumPaid();
        paid[2] = heavy.getVehicleNumPaid();
        notPaid[0] = twoWheeler.getVehicleNumNotPaid();
        notPaid[1] = medium.getVehicleNumNotPaid();
        notPaid[2] = heavy.getVehicleNumNotPaid();
        double total = paid[0] + paid[1] + paid[2] + notPaid[0] + notPaid[1] + notPaid[2];

        System.out.println("\nFinal Report of the Day:\nNo. of vehicles passes: " + total);
        System.out.println("No. of vehicle that paid the Toll Fee: " + Vehicle.paid);
        System.out.println("No. of vehicles that did not pay the Toll Fee: " + Vehicle.notPaid);
        System.out.println("\nTwo Wheelers: \nPaid Vehicles: " + paid[0] + "\nNon-paying vehicle: " + notPaid[0] + "\nAmount earned: " + paid[0] * 10);
        System.out.println("\nMedium Vehicle(4 Wheeler): \nPaid Vehicles: " + paid[1] + "\nNon-paying vehicle: " + notPaid[1] + "\nAmount earned: " + paid[1] * 20);
        System.out.println("\nHeavy Vehicle(4 Wheeler): \nPaid Vehicles: " + paid[2] + "\nNon-paying vehicle: " + notPaid[2] + "\nAmount earned: " + paid[2] * 50);
        System.out.println("\nTotal Amount earned: " + Vehicle.amount);
        System.out.println("Total Amount lost: " + Vehicle.lostAmount);

        input.close();
    }
}