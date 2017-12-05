package com.yangguang;

import com.yangguang.Class.*;

import java.io.*;
import java.util.*;

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
        b = (int) 1.23;
        System.out.println(b);

        //向上转型，仍调用子类方法
        MusicCup aCup = new BrokenCup();
        aCup.addWater(10);
        Human guest = new Human(5);
        BrokenCup bCup = new BrokenCup();
        guest.drink(bCup, 10);

        //String字符串类
        String s = "yangguang  ";
        System.out.println("字符串长度" + s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(0, 4));
        System.out.println(s.indexOf("gg"));
        System.out.println(s.equals("yang"));
        System.out.println("length:" + s.trim().length());

        //异常处理
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Problem");
        }
        System.out.println("捕获异常后继续执行...");

        Battery battery = new Battery();
        battery.chargeBattery(0.5);
        battery.useBattery(-0.5);

        //文件读操作
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO Read Problem");
        }

        //文件写操作
        try {
            String content = "Thank you for your fish.";
            File file = new File("new.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            System.out.println("IO Write Problem");
        }

        //多线程
        NewThread thread1 = new NewThread();
        NewThread thread2 = new NewThread();
        //thread1.start();
        //thread2.start();

        Thread thread3 = new Thread(new NewThread2(), "first");
        Thread thread4 = new Thread(new NewThread2(), "second");
        //thread3.start();
        //thread4.start();

        //多线程卖票程序
        Reservoir r = new Reservoir(30);
        //Booth b1 = new Booth(r);
        //Booth b2 = new Booth(r);
        //Booth b3 = new Booth(r);

        //数组
        Human[] persons = new Human[2];
        persons[0] = new Human(160);
        persons[1] = new Human(150);
        int[] a1 = {1, 2, 3, 4};
        System.out.println(a1[2]);
        String[] s1 = {"Tom", "Tim", "Bob"};
        System.out.println(s1[1]);

        //List
        List<String> l1 = new ArrayList<String>();
        l1.add("good");
        l1.add("bad");
        l1.add("shit");
        l1.remove(0);
        System.out.println(l1.get(1));
        System.out.println(l1.size());

        //Set、Iterator
        Set<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);
        System.out.println("set大小：" + set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Map
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("Vao", 11);
        m1.put("Boo", 22);
        m1.put("CC", 33);
        System.out.println(m1.get("CC"));

        //内部类
        OuterClass oc = new OuterClass("HH");
        oc.drinkWater(0.3);
        OuterClass.Cup soloCup = oc.new Cup();
        soloCup.getWater();
    }
}
