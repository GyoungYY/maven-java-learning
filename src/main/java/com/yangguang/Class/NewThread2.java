package com.yangguang.Class;

//实现多线程方式2
public class NewThread2 implements Runnable {
    public String toString() {
        return Thread.currentThread().getName();
    }

    public void run() {
        System.out.println(this);
    }
}
