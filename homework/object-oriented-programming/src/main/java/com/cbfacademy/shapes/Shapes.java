package com.cbfacademy.shapes;

public class Shapes {
    public static void main(String[] args) {
        Square square = new Square(20);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Square square2 = new Square(4);
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());

        Square square3 = new Square(12);
        System.out.println(square3.getArea());
        System.out.println(square3.getPerimeter());

        Circle circle = new Circle(15);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle2 = new Circle(10);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

        Circle circle3 = new Circle(5);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());
    }
}
