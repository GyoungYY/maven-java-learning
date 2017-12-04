package com.yangguang.Class;

public class Battery {
    private double power = 0.0;

    public void chargeBattery(double p) {
        if (this.power < 1) {
            this.power = this.power + p;
        }
    }

    public boolean useBattery(double p) {
        try {
            test(p);
        } catch (Exception e) {
            System.out.println("catch exception");
            System.out.println(e.getMessage());
        }
        if (this.power >= p) {
            this.power = this.power - p;
            return true;
        } else {
            this.power = 0.0;
            return false;
        }
    }

    private void test(double p) throws Exception {
        if (p < 0) {
            Exception e = new Exception("p must be a positive");
            throw e;
        }
    }

    public double getPower() {
        return this.power;
    }
}
