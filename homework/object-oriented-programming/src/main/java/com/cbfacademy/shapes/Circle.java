package com.cbfacademy.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(2, radius);
    }

}
