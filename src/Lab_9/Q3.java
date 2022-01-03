package Lab_9;

class Thread3 extends Thread {
    public Thread3() {
        super("Abhinand");
        start();
    }

    public void run() {
        System.out.println("From run : " + getName());
    }
}

public class Q3 {
    public static void main(String args[]) {
        new Thread3();
    }
}
