package ExtendsDemo;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        zi z=new zi();
        z.show();
    }
}
class fu{
    String name="fu";
}
class zi extends fu{
    String name="zi";
    public void show(){
        String name="zishou";
        System.out.println(name);//就近原则，哪个近输出哪个
        System.out.println(this.name);//this意为本类中，本类中的成员变量
        System.out.println(super.name);//super意为父类中，父类中的成员变量
    }
}