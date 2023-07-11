package Polymorphic;

/*
    多态是指对象的多种形态
 */
/*
    多态的前提是有继承/实现关系
    有父类引用指向子类对象
    有方法的重写
 */
/*
    多态的好处？
    使用父类作为参数，可以接受所有子类对象
    体现多态的扩展性与便利
 */
public class Test1 {
    public static void main(String[] args) {
        student s=new student();
        teacher t=new teacher();
        s.setName("张三");
        s.setAge(28);
        t.setName("李四");
        t.setAge(25);
        show(s);
        show(t);
    }
    public static void show(person p){ //用父类作为参数对象，可以接收其下所有子类对象
        p.show(); //根据参数类型不同，虚拟机会自行选择对应类中的成员方法
        //前提是要有方法的重写！！！！！！
    }
}
class person{
    private String name;
    int age;

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

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
class student extends person{
    @Override
    public void show() {
        System.out.println(getName()+","+getAge());
    }
}
class teacher extends person{
    @Override
    public void show() {
        System.out.println(getName()+","+getAge());
    }
}