package Lab_9;

class Thread2 implements Runnable {
    Thread thread;

    public Thread2() {
        thread = new Thread(this, "Abhinand");
        thread.start();
    }

    public void run() {
        System.out.println("From run : " + thread.getName());
    }
}

public class Q2 {

    public static void main(String args[]) {
        new Thread2();
    }

}
