package StringDome;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=s.charAt(3);//找到字符串中下标为3的字符并返回
        int len=s.length();//求字符串长度
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));//遍历字符串
        }
        System.out.println();
        System.out.println(s+" "+ch+" "+len);
        String shenfen="230126200101290376";
        String news=shenfen.substring(6,14);//字符串的截取
        String new1=shenfen.replace("2","*");//字符串的内容替换
        System.out.println(news);
        System.out.println(new1);
    }
}
