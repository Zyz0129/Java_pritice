package ExtendsDemo;
/*
    演示类的继承
 */
public class ExtendsDemo1 {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.catchMouth();
        c1.drink();
        c1.eat();
    }
}
/*
    一个类应该建立单独的class文件
    这里用于方便展示
    并不推荐这样创建类
 */
class Animal{
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
class cat extends Animal{ //继承关键字extends，cat为子类，animals为父类
    public void catchMouth(){
        System.out.println("抓老鼠");
    }
}