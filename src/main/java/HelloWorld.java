import com.yangguang.*;

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
    }
}
