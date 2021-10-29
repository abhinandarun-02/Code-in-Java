package com.company;

public class Rectangle {
    private int length;
    private int breadth;

    Rectangle(){
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public int getArea() {
        return this.length * this.breadth;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.breadth);
    }

}
