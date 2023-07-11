package StringDome;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerTest { //高效/方便的操作字符串，并插入字符
    public static void main(String[] args) {
        StringJoiner sj1=new StringJoiner(",");
        StringJoiner sj2=new StringJoiner(",","[","]");
        Scanner sc=new Scanner(System.in);
        sj1.add(sc.next()).add(sc.next()).add(sc.next());
        int len1= sj1.length();
        System.out.println(len1);
        System.out.println(sj1);
        String s1=sj1.toString();
        System.out.println(s1);
        sj2.add(sc.next()).add(sc.next()).add(sc.next());
        int len2=sj2.length();
        System.out.println(len2);
        System.out.println(sj2);
        String s2=sj2.toString();
        System.out.println(s2);
    }
}
