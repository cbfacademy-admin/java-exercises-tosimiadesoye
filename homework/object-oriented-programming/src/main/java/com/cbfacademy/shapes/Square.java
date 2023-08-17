package com.cbfacademy.shapes;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        return Math.pow(2, width);

    }

    @Override
    public double getArea() {

        return 4 * width;
    }

}
