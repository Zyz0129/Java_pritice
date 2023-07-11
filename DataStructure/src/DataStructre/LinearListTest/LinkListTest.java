package DataStructre.LinearListTest;

import DataStructre.LinearList.LinkList;

import java.util.Scanner;

public class LinkListTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LinkList L=new LinkList();
        int n=input.nextInt();
        while(n!=-1){
            L.insert(n);
            n=input.nextInt();
        }
        System.out.println(L.isEmpty());
        System.out.println("-------");
        System.out.println(L.length());
        System.out.println("-------");
        System.out.println(L.get(3));
        System.out.println("-------");
        L.ergodic();
        System.out.println("-------");
        L.insert(100,3);
        L.ergodic();
        L.reverse();
        L.ergodic();
        System.out.println("-------");
        System.out.println(L.remove(4));
        System.out.println("-------");
        L.ergodic();
    }
}
