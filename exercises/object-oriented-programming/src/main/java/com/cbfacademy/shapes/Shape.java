package com.cbfacademy.shapes;

public abstract class Shape {

   public String shapeName;

    public abstract double area(double radius);

    @Override
    public String toString() {
        return shapeName;
    }

  
}
