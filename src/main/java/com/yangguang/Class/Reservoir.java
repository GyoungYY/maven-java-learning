package com.yangguang.Class;

public class Reservoir {
    private int total;

    public Reservoir(int t){
        this.total = t;
    }

    //卖票方法，synchronized修饰符表示该方法同时只能被一个线程调用
    public synchronized boolean sellTicket(){
        if(this.total > 0){
            this.total = this.total - 1;
            return true;
        }else{
            return false;
        }
    }
}
