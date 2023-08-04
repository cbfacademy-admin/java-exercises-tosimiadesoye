package com.cbfacademy.shapes;

public class PaintShapes {
    public void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        System.out.println(rectangle.area(50));
        System.out.println(ball.area(50));
        System.out.println(tank.area(50));
    }
}
