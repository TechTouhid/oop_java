package com.touhid;

public class Vehicle {
    private String name;
    private String size;

    private int cuttentVelocity;
    private int cuttentDiretion;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.cuttentVelocity = 0;
        this.cuttentDiretion = 0;
    }

    public void steer(int direction) {
        this.cuttentDiretion += direction;
        System.out.println("Vehicle.steer(): Steering at " + cuttentDiretion + " degrees");
    }

    public void move(int velocity, int direction) {
        cuttentVelocity = velocity;
        cuttentDiretion = direction;
        System.out.println("Vehicle.move(): Moving at " + cuttentVelocity + " in direction " + cuttentDiretion);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCuttentVelocity() {
        return cuttentVelocity;
    }

    public int getCuttentDiretion() {
        return cuttentDiretion;
    }

    public void stop() {
        this.cuttentVelocity = 0;
    }
}
