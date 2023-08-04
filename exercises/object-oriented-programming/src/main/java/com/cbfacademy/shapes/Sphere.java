package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        this.shapeName = "Sphere";
    }

    @Override
    public double area(double radius) {
        return 4 * Math.PI * (Math.pow(radius, 2));
    }

}