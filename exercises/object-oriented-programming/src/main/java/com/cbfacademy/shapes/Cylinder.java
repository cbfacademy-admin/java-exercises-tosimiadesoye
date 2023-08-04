package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.shapeName = "Cylinder";

    }

    @Override
    public double area(double radius) {
        return radius = height * Math.PI * Math.pow(2, radius);

    }
}
