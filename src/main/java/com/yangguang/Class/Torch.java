package com.yangguang.Class;

import com.yangguang.Class.Battery;

//组合Battery类
public class Torch {
    private Battery theBattery = new Battery();

    public void turnOn(int hours) {
        boolean usable;
        usable = this.theBattery.useBattery(hours * 0.1);
        if (usable != true) {
            System.out.println("no more usable,must charge");
        }
    }

    public void charge(int hours) {
        this.theBattery.chargeBattery(hours * 0.2);
    }
    public double getPower(){
        return this.theBattery.getPower();
    }
}
