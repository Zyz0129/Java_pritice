package StringDome;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        /*
        ÅÐ¶Ï»ØÎÄ´®
         */
        StringBuilder sb1=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        sb1.append(sc.next());
        String s1=sb1.toString();
        sb1.reverse();
        String s2=sb1.toString();
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
