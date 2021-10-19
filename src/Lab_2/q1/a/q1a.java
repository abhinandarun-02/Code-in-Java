package Lab_2.q1.a;

class Box {
    double width;
    double height;
    double depth;
}

public class q1a {
    public static void main(String[] args) {

        Box my_box = new Box();
        my_box.width = 10;
        my_box.height = 20;
        my_box.depth = 15;
        double vol = my_box.width * my_box.height * my_box.depth;
        System.out.println("Volume is " + vol);
    }
}
