package com.yangguang.Class;

public class Booth extends Thread {
    private static int threadId = 0;
    private Reservoir release;
    private int count = 0;

    public Booth(Reservoir r) {
        super("ID:" + (++threadId));
        this.release = r;
        this.start();
    }

    public String toString() {
        return super.getName();
    }

    public void run() {
        while (true) {
            if (this.release.sellTicket()) {
                this.count = this.count + 1;
                System.out.println(this.getName() + ":sell 1");
                try {
                    sleep((int) Math.random() * 100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                break;
            }
        }
        System.out.println(this.getName() + "I sold:" + this.count);
    }
}
