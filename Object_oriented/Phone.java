package Object_oriented;

public class Phone {
    private String name;//private表示私有化
    private int price;

    public Phone(String name,int price){ //有参的构造方法，在创建对象时，可以直接传参，就不用set方法了
        this.name=name;
        this.price=price;
    }
    /*
    有参构造方法和无参构造方法
    方法名称相同，参数不同
    虚拟机JVM会根据参数的不同自行选择对应的构造方法
    即为构造方法的重载
     */
    public Phone(){ //无参的构造方法，在创建无参对象时，自行调用
        System.out.println("执行");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>10000){
            System.out.println("太贵了");
        }else{
            this.price=price;
        }
    }

    public void call() {
        System.out.println("我要打电话啦");
    }

    public void playgame() {
        System.out.println("我要打游戏啦");
    }
}
