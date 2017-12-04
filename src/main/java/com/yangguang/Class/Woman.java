package com.yangguang.Class;

import com.yangguang.Class.Human;

//类的继承，只能有一个父类
public class Woman extends Human {

    public Woman(int h){
        super(h);
    }
    public Human giveBirth(){
        System.out.println("give birth");
        return (new Human(20));
    }
}
