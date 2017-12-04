package com.yangguang.Class;

//实现多线程方式1
public class NewThread extends Thread {
    private static int threadID = 0;

    public NewThread() {
        super("ID:" + (++threadID));
    }

    public String toString() {
        return super.getName();
    }

    public void run() {
        System.out.println(this);
    }
}
