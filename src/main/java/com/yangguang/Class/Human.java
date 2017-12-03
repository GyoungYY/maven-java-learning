package com.yangguang;

public class Human {
    private int height;

    public Human(int h) {
        this.height = h;
        System.out.println("I'm in constructor!");
    }

    public Human(int h, String s) {
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
}
