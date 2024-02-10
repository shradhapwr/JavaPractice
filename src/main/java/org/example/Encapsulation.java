package org.example;

public class Encapsulation {

    private String make;
    private String model;
    private int year;

    private String color;

    private int noOfWheels;

    @Override
    public String toString() {
        return "Encapsulation{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }

    public Encapsulation() {
    }

    public Encapsulation(String make) {
        this.make = make;
    }

    public Encapsulation(String make, String model, int year, String color, int noOfWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    public Encapsulation(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
