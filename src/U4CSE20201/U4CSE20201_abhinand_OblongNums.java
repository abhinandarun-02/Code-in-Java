package U4CSE20201;

class U4CSE20201_abhinand_OblongNums extends Thread {

    private final int N;

    public U4CSE20201_abhinand_OblongNums(String name, int n) {
        super(name);
        this.N = n;
    }

    public void run() {
        System.out.println("Start Thread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        System.out.println("First " + N + " Oblong Numbers are : ");
        for (int i = 0; i <= N; i++) {
            System.out.print(i * (i + 1) + " ");
        }
        System.out.println("\n... Exit Thread");

    }


}

