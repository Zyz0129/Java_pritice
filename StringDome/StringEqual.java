package StringDome;

public class StringEqual {
    public static void main(String[] args) {
        /*
            字符串的建立有四种
         */
        String s1="abc";//第一种，直接赋值，该值存储在内存空间的串池中
        String s2="abc";
        System.out.println(s1==s2);//在串池中，只创建了一个字符串abc
                                    //s1,s2指向串池中同一块空间，共享使用
        //第二种，有参构造方法创建字符串，该字符串存储在内存空间的堆内存中
        String s3=new String("abc");//在堆内存中new了一块新空间
        String s4=new String("abc");//s3,s4指向两块空间，地址不同
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        //第三种，也是堆内存,根据字符数组建立字符串，在对字符串有所修改的场景下使用
        char []ch={'a','b','c'};
        String s5=new String(ch);
        System.out.println(s5);
        //第四种，根据byte数组的内容，查询相应的Ascii码表进行转码
        byte []by={97,98,99};
        String s6=new String(by);
        System.out.println(s6);
        /*
            作为引用数据类型，s1234存储的
            都是字符串在内存中的地址
         */
        //字符串内容的比较
        //equals方法比较时，只有内容一模一样猜返回true，否则返回false
        //equalsIgnoreCase方法，可以比较忽略大小写的英文字符串
        String s7="ABC";
        boolean b1=s1.equals(s2);
        System.out.println(b1);
        boolean b2=s1.equals(s7);
        System.out.println(b2);
        boolean b3=s1.equalsIgnoreCase(s7);
        System.out.println(b3);
        /*
            用键盘接收的字符串是new出来的
            存放在堆内存当中
            地址值与直接赋值的肯定不一样
         */
    }
}
