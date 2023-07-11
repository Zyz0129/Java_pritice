package InterfaceDemo;
/*
    要求：
        兔子：属性：姓名，年龄     行为：吃胡萝卜
        猫：属性：姓名，年龄      行为：吃鱼，游泳
        狗：属性：姓名，年龄      行为：吃肉，游泳
    三个动物的属性可以继承一个父类
    吃东西的行为需要进行重写
    是否会游泳，写成一个接口，会游泳的接入接口关系
 */
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Rabbit rab=new Rabbit("小兔",2);
        System.out.println(rab.getName()+", "+rab.getAge());
        rab.eat();
        Cat cat=new Cat("小猫",3);
        System.out.println(cat.getName()+", "+cat.getAge());
        cat.eat();
        cat.swim();
        Dog dog=new Dog("大黄",1);
        System.out.println(dog.getName()+", "+dog.getAge());
        dog.eat();
        dog.swim();
    }
}
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
    public abstract void eat();
}
class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
class Cat extends Animal implements Swim{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void swim() {
        System.out.println("猫刨");
    }
}
class Dog extends Animal implements Swim{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("吃肉");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
interface Swim{
    public abstract void swim();
}
