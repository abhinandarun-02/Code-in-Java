package Lab_2.q1.b;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return (width * height * depth);
    }
}

public class q1b {

    public static void main(String[] args) {

        Box my_box1 = new Box();
        double vol1, vol2;
        my_box1.width = 10;
        my_box1.height = 20;
        my_box1.depth = 30;
        vol1 = my_box1.volume();
        System.out.println("Volume is " + vol1);

        Box my_box2 = new Box();
        my_box2.width = 100;
        my_box2.height = 200;
        my_box2.depth = 300;
        vol2 = my_box2.volume();
        System.out.println("Volume is " + vol2);
    }

}
