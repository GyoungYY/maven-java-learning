package com.yangguang.Class;

//一个类实现多个接口
public class MusicCup implements Cup, MusicPlayer {
    private int water = 0;

    public void addWater(int w) {
        this.water = this.water + w;
    }

    public void drinkWater(int w) {
        this.water = this.water - w;
    }

    public int waterContent() {
        return this.water;
    }

    public void play() {
        System.out.println("hahaha...");
    }
}
