package InterfaceDemo;

public class InterfaceDemo3 {
}
/*
    接口中的默认方法定义格式：
        格式：public default 返回值类型 方法名（参数列表）{  }
    接口中默认方法的注意事项：
        1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候要去掉default关键字
        2.public可以省略，但是default关键字不能省略
        3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类实现接口时必须重写
 */
interface jiekou1{
    void show1();
    default void show11(){
        System.out.println("接口1中的show方法");
    }
}
interface jiekou2{
    void show2();
    default void show11(){
        System.out.println("接口2中的show方法");
    }
}
class test implements jiekou1,jiekou2{

    @Override
    public void show1() {

    }

    @Override
    public void show11() { //接口1，接口2中存在相同的方法名，需要重写
        jiekou1.super.show11();
    }

    @Override
    public void show2() {

    }

}