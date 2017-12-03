package com.yangguang.Class;

public class Battery {
    private double power = 0.0;

    public void chargeBattery(double p) {
        if (this.power < 1) {
            this.power = this.power + p;
        }
    }

    public boolean useBattery(double p) {
        if (this.power >= p) {
            this.power = this.power - p;
            return true;
        } else {
            this.power = 0.0;
            return false;
        }
    }

    public double getPower(){
        return this.power;
    }
}
