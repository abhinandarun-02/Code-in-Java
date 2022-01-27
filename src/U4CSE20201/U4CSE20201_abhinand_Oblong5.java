package U4CSE20201;

class U4CSE20201_abhinand_Oblong5 extends Thread {

    private final int N;

    public U4CSE20201_abhinand_Oblong5(String name, int n) {
        super(name);
        this.N = n;
    }

    public void run() {
        System.out.println("Start Thread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        System.out.println("Oblong numbers divisible by 5 are :");
        int[] oblong = new int[N];
        for (int i = 0; i < N; i++) {
            oblong[i] = i * (i + 1);
        }
        for (int i = 1; i < N; i++) {
            if (oblong[i] % 5 == 0) {
                System.out.print(oblong[i] + " ");
            }
        }

        System.out.println("\n... Exit Thread");
    }

}

