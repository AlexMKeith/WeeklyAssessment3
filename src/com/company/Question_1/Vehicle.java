package com.company.Question_1;

public class Vehicle {

    private int gas;
    private int speed;

    public Vehicle(int gas, int speed) {
        this.gas = gas;
        this.speed = speed;
    }

    public Vehicle() {
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
