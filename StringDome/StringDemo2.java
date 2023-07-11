package StringDome;

public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");//可以将StringBuilder类创建的对象看成一个容器
        sb.append(1);//String Builder类的添加元素方法，可以是任意类型，方法的重载
        sb.append(2.3);
        sb.append(true);
        sb.append("def");


        System.out.println(sb);//StringBuilder类建立对象，直接打印并不是地址值，而是属性值
        sb.reverse();//将容器中的元素反转
        System.out.println(sb);
        int num=sb.length();
        System.out.println(num);//求容器中元素个数，也就是字符串长度
        /*
            如果将StringBuilder的对象容器中的元素转换为String字符串类型
            应该用ToString方法
         */
        String s=sb.toString();
        System.out.println(s);
    }
}
