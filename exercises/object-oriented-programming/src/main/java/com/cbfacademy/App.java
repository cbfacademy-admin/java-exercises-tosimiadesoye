package com.cbfacademy;

import com.cbfacademy.project.Car;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porsche", "V40", 2009);
        Car car3 = new Car("Audi", "A3", 2018);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        /*
         * A Volvo V40 from 2012
         * a Porsche Panamera from 2009
         * an Audi A3 from 2018
         */
        // System.out.println("A " + car.getMake("Volvo") + car.getModel(" V40") + " from " + car.getYear(2012));
        // System.out.println("A " + car.getMake("Porsche") + car.getModel(" Panamera") + " from " + car.getYear(2009));
        // System.out.println("An " + car.getMake("Audi") + car.getModel(" A3") + " from " + car.getYear(2018));
    }
}
