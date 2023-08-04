package com.cbfacademy;

import com.cbfacademy.project.Car;
import com.cbfacademy.shapes.Cylinder;
import com.cbfacademy.shapes.Paint;
import com.cbfacademy.shapes.Rectangle;
import com.cbfacademy.shapes.Sphere;


public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porsche", "V40", 2009);
        Car car3 = new Car("Audi", "A3", 2018);
        //  System.out.println(car1);
        //  System.out.println(car2);
        //  System.out.println(car3);

         Paint paint = new Paint(30);

        Rectangle rectangle = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        System.out.println(rectangle.area(50));
        System.out.println(ball.area(50));
        System.out.println(tank.area(50));
        

     

    }
}
