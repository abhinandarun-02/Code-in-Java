package Lab_2.q1.e;

class Box {
    private double width;
    double height;
    public double depth;

    double volume() {
        return (width * height * depth);
    }

    void get_width(int w) {
        width = w;
    }
}

public class q1e {

    public static void main(String[] args) {

        double vol1;
        Box my_box1 = new Box();
        my_box1.depth = 10;
        my_box1.height = 20;
        my_box1.get_width(30);
        vol1 = my_box1.volume();
        System.out.println("Volume is " + vol1);

    }

}