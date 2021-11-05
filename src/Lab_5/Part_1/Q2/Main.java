package Lab_5.Part_1.Q2;

public class Main {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(2, 3);
        System.out.println("\nArea of Rectangle = " + rect1.getArea());
        System.out.println("Perimeter of Rectangle = " + rect1.getPerimeter());

        Square sq1 = new Square(2);
        System.out.println("\nArea of Square = " + sq1.getArea());
        System.out.println("Perimeter of Square = " + sq1.getPerimeter());

    }
}
