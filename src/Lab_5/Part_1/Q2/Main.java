package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(2, 3);
        System.out.println("\nArea of Rectangle = " + rect1.getArea());
        System.out.println("Perimeter of Rectangle = " + rect1.getPerimeter());

        Square sq1 = new Square(2);
        System.out.println("\nArea of Square = " + sq1.getArea());
        System.out.println("Perimeter of Squrare = " + sq1.getPerimeter());

    }
}
