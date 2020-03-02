package com.touhid;

public class Outlander extends Vehicle_Car {
    private int roadServiceMonts;

    public Outlander( int roadServiceMonts) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonts = roadServiceMonts;
    }

    public void accelerator(int rate) {
        int newVelocity = getCuttentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCuttentDiretion());
        }
    }
}
