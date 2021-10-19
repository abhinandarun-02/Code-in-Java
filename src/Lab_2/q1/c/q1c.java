package Lab_2.q1.c;

class Box {
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return (width * height * depth);
    }
}

public class q1c {

    public static void main(String[] args) {

        double vol1, vol2;
        Box my_box1 = new Box();
        my_box1.setDim(10, 20, 15);
        vol1 = my_box1.volume();
        System.out.println("Volume is " + vol1);

        Box my_box2 = new Box();
        my_box2.setDim(3, 6, 9);
        vol2 = my_box2.volume();
        System.out.println("Volume is " + vol2);
    }
}