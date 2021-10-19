package Lab_2.q1.d;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return (width * height * depth);
    }

    void setDim(double w, double h, double d) {
     width = w;
     height = h;
     depth = d;
 }
}

public class q1d {

    public static void main(String[] args) {

        double vol1, vol2;
        Box my_box1 = new Box();
        vol1 = my_box1.volume();
        System.out.println("Volume is " + vol1);

        Box my_box2 = new Box(10, 20, 15);
        vol2 = my_box2.volume();
        System.out.println("Volume is " + vol2);

    }

}