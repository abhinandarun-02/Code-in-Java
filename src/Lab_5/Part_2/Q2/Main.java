package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var area = new Area();

        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();
        System.out.println("Area of Rectangle is : " + area.RectangleArea(length, breadth));

        System.out.print("Enter the side : ");
        int side = sc.nextInt();
        System.out.println("Area of Square is : " + area.SquareArea(side));


        System.out.print("Enter the radius : ");
        int radius = sc.nextInt();
        System.out.println("Area of Circle is : " + area.CircleArea(radius));


    }
}
