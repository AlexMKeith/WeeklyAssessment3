package com.company.Question_1;

public class Car extends Vehicle {

    private String make;
    private String model;

    public Car(int gas, int speed, String make, String model) {
        super(gas, speed);
        this.make = make;
        this.model = model;
    }

    public Car(int gas, int speed) {
        super(gas, speed);
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
}
