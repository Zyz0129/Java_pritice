package MethodDemo;

public class mathod {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        double d=1.5;
        double f=2.3;
        System.out.println(sum(a,b));//
        System.out.println(sum(d,f));//即为方法的重载
        System.out.println(sum(a,b,c));//
        /*add(a,b);
        fn();
        int ans=add1(a,b);
        System.out.println(ans);*/

    }
    //最简单的方法定义，无返回值，无参数
    public static void fn(){
        System.out.println("哈哈哈哈哈哈大傻逼");
        System.out.println("哈哈哈哈哈哈大傻逼");
        System.out.println("哈哈哈哈哈哈大傻逼");
        System.out.println("哈哈哈哈哈哈大傻逼");
        System.out.println("哈哈哈哈哈哈大傻逼");
        System.out.println("哈哈哈哈哈哈大傻逼");
    }
    //有参数的方法定义
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    //有返回值的方法定义
    public static int add1(int a,int b){
        return a+b;
    }
    //
    //
    //
    //
    //方法的重载
    //在同一个类中，即使方法名全部相同，java会根据参数的不同自己选择相应的方法
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a,double b){
        return a+b;
    }
}





















