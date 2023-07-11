package ExtendsDemo;

public class ExtendsDemo3 {
    public static void main(String[] args) {
        chinese p1=new chinese();
        p1.show();
        foreign p2=new foreign();
        p2.show();
    }
}
class person{
    /*
        父类子类中的成员方法名字相同时
        即为方法的重写
        当父类中的方法满足不了子类的需求时
        可以进行方法的重写
        重写时，要在新方法上面加上@Override
        用于新方法语法错误的判断
        符合编码规则
        建议必须写
     */
    /*
        重写的方法建议和父类保持一致（方法名，参数类型个数，返回值类型），建议都保持一致
        静态方法，私有方法不可重写
     */
    public void eat(){
        System.out.println("吃米饭");
    }
    public void drink(){
        System.out.println("喝凉白开");
    }
}
class chinese extends person{
    public void show(){
        eat();
        this.eat();
        super.eat();
        System.out.println("-------------------");
        drink();
        this.drink();
        super.drink();
    }
}
class foreign extends person{
    @Override
    public void eat(){
        System.out.println("吃面包");
    }
    @Override
    public void drink(){
        System.out.println("喝牛奶");
    }
    public void show(){
        eat();
        this.eat();
        super.eat();
        System.out.println("-------------------");
        drink();
        this.drink();
        super.drink();
    }
}