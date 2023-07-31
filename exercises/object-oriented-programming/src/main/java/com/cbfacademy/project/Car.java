package com.cbfacademy.project;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public String getMake(String make) {
        return make;
    }

    public String getModel(String model) {
        return model;
    }

    public int getYear(int year) {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @override
    public String string() {
        return "A" + make + " " + model + "from" + "(" + year + ")";
    }

}
