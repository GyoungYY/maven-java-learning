package com.yangguang;

import com.yangguang.Class.*;

public class HelloWorld {
    public static void main(String[] args) {
        //基本类型
        int a = 5;
        System.out.println(a + 1);
        System.out.println("hello world");
        int[] array1 = new int[5]; //已经分配空间
        int[] array2 = new int[]{1, 3, 5, 7, 9};

        //类、包
        Human aPerson = new Human(5, "shit");
        //new是在内存的堆(heap)上为对象开辟空间,aPerson在栈中(stack)存对象引用
        //这里的内存是指JVM虚拟出来的java进程内存空间
        aPerson.repeatBreath(3);
        aPerson.growHeight(5);
        System.out.println(aPerson.getHeight());

        //组合
        Torch aTorch = new Torch();
        aTorch.charge(2);
        aTorch.turnOn(3);
        System.out.println(aTorch.getPower());

        //继承
        Woman woman = new Woman(5);
        woman.growHeight(10);
        System.out.println(woman.getHeight());

        //static数据和方法
        System.out.println("人口总数：" + Human.getPopulation());

        //类型转换
        int b;
        b = (int)1.23;
        System.out.println(b);

        //向上转型，仍调用子类方法
        MusicCup aCup = new BrokenCup();
        aCup.addWater(10);
        Human guest = new Human(5);
        BrokenCup bCup = new BrokenCup();
        guest.drink(bCup,10);
    }
}
