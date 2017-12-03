package com.yangguang;

public class Woman extends Human{

    public Woman(int h){
        super(h);
    }
    public Human giveBirth(){
        System.out.println("give birth");
        return (new Human(20));
    }
}
