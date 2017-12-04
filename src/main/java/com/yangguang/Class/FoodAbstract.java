package com.yangguang.Class;

//抽象类继承与普通类继承一样，但是abstract方法必须要有具体定义，没有的话又是抽象类了
public abstract class FoodAbstract {
    public abstract void eat();
    public void happyFood(){
        System.out.println("Good! Eat me!");
    }
}
