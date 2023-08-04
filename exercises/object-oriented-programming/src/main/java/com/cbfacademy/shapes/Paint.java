package com.cbfacademy.shapes;

public class Paint {
    private double coverage;
    private double radius;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        double area = shape.area(radius);
        return area / coverage;

    }

}
