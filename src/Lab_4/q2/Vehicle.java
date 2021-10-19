package Lab_4.q2;

public class Vehicle {
    static double amount; //amount earned
    static double lostAmount; //amount lost
    static double notPaid; //number of vehicles not paid
    static double paid; //number of vehicles paid

    private double vehicleNumPaid; //number of vehicles of each object paid
    private double vehicleNumNotPaid; //number of vehicle of each object not paid

    Vehicle() {
        amount = notPaid = paid = vehicleNumPaid = vehicleNumNotPaid = 0;
    }

    public static void incrementNotPaid(int vehicleType, Vehicle V) {
        notPaid++;
        if (vehicleType == 1) {
            V.vehicleNumNotPaid++;
            lostAmount += 10;
        } else if (vehicleType == 2) {
            V.vehicleNumNotPaid++;
            lostAmount += 20;
        } else if (vehicleType == 3) {
            V.vehicleNumNotPaid++;
            lostAmount += 50;
        }
    }

    public static void incrementPaid(int vehicleType, Vehicle V) {
        paid++;
        if (vehicleType == 1) {
            V.vehicleNumPaid++;
            amount += 10;
        } else if (vehicleType == 2) {
            V.vehicleNumPaid++;
            amount += 20;
        } else if (vehicleType == 3) {
            V.vehicleNumPaid++;
            amount += 50;
        }
    }

    public double getVehicleNumPaid() {
        return vehicleNumPaid;
    }

    public double getVehicleNumNotPaid() {
        return vehicleNumNotPaid;
    }
}