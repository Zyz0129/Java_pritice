package AbstractDemo;
/*
    抽象类，抽象方法是在协作中使用的
    可以强制子类重写方法
 */
public class AbstractDemo1 {
    public static void main(String[] args) {
        cat c=new cat("小猫",2);
        dog d=new dog("小狗",3);
        System.out.println(c.getName()+", "+c.getAge());
        System.out.println(d.getName()+", "+d.getAge());
        c.eat();
        d.eat();
    }
}
/*
    含有抽象方法的类一定是抽象类
    但是抽象类不一定含有抽象方法
    抽象类不能创建对象
 */
abstract class Animal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }
    /*
        下方为抽象方法，在子类继承父类时
        子类必须重写该抽象方法，否则依旧不能建立对象
     */
    public abstract void eat();
}
class cat extends Animal{

    public cat(String name, int age) {
        super(name, age);
    }

    public cat() {
    }

    @Override
    public void eat() {
        /*
        必须进行对父类中抽象方法的重写
        否则报错
         */
        System.out.println("猫吃鱼");
    }
}
class dog extends Animal{

    public dog(String name, int age) {
        super(name, age);
    }

    public dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}