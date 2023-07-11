package DataStructre.LinearListTest;

import DataStructre.LinearList.TwoWayLinkList;

import java.util.Scanner;

public class TwoWayLinkListTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        TwoWayLinkList L=new TwoWayLinkList();
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
        L.ergodic1();
        L.ergodic2();
        System.out.println("-------");
        L.insert(100,3);
        L.ergodic1();
        L.ergodic2();
        System.out.println("-------");
        System.out.println(L.remove(4));
        System.out.println("-------");
        L.ergodic1();
        L.ergodic2();
    }
}
