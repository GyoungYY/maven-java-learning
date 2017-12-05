package com.yangguang.Class;

public class OuterClass {
    private Cup ic;
    private String name;

    public OuterClass(String n){
        this.ic = new Cup();
        this.name = n;
    }

    public void drinkWater(double w){
        ic.useCup(w);
        System.out.println(ic.getWater());
    }
    public class Cup{
        private double water = 1.0;

        public void useCup(double w){
            this.water = this.water - w;
        }

        public double getWater(){
            return this.water;
        }
    }
}
