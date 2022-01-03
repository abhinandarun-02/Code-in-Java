package Lab_9;

public class sample {

    public static void main(String[] args) {
        System.out.println("Main Thread Started");

        racer racer1 = new racer("1");
        var racer2 = new racer("2");

        racer1.start();
        racer2.start();

        System.out.println("Main Thread Ended");
    }



}
