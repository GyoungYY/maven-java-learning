package com.yangguang.Class;

public class Human {
    private int height;
    private static int population;
    public static boolean is_mammal = true;

    public Human(int h) {
        Human.population += 1;
        this.height = h;
        System.out.println("I'm in constructor!");
    }

    public Human(int h, String s) {
        Human.population += 1;
        this.height = h;
        System.out.println("I'm in constructor2,," + s);
    }

    private void breath() {
        System.out.println("Human.breath");
    }

    private void breath(int c) {
        int i;
        for (i = 0; i < c; i++) {
            System.out.println("in breath2");
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void growHeight(int h) {
        this.height = this.height + h;
    }

    public void repeatBreath(int c) {
        int i;
        for (i = 0; i < c; i++) {
            this.breath();
        }
    }

    public static int getPopulation(){
        return Human.population;
    }

    public void drink(MusicCup aCup,int w){
        aCup.drinkWater(w);
    }
}
