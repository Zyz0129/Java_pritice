package StringDome;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=s.charAt(3);//�ҵ��ַ������±�Ϊ3���ַ�������
        int len=s.length();//���ַ�������
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));//�����ַ���
        }
        System.out.println();
        System.out.println(s+" "+ch+" "+len);
        String shenfen="230126200101290376";
        String news=shenfen.substring(6,14);//�ַ����Ľ�ȡ
        String new1=shenfen.replace("2","*");//�ַ����������滻
        System.out.println(news);
        System.out.println(new1);
    }
}
