package Lab_5.Part_2.Q2;

public class Area extends Shape {

    public double RectangleArea(int length, int breadth) {
        return length * breadth;
    }

    public double SquareArea(int side) {
        return side * side;
    }

    public double CircleArea(int radius) {
        return 3.14 * radius * radius;
    }
}

