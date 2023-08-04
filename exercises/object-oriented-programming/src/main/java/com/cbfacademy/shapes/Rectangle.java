package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length,
            double width) {
        this.length = length;
        this.width = width;
        this.shapeName = "Rectangle";

    }

    @Override
   public double area(double area) {
        return area = length * width;

    }
}
