package Lab_9;

public class racer extends Thread{

    String name;

    racer(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(name + " " + i);

        }
        System.out.println("Exiting Child Thread " + name);

    }
}