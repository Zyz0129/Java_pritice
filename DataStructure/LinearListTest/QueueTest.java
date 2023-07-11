package DataStructre.LinearListTest;

import DataStructre.LinearList.Queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Queue s=new Queue();
        int n=input.nextInt();
        while(n!=-1){
            s.enQueue(n);
            n=input.nextInt();
        }
        System.out.println(s.isEmpty());
        System.out.println("-------");
        System.out.println(s.length());
        System.out.println("-------");
        while(!s.isEmpty()){
            System.out.print(s.deQueue()+" ");
        }
    }
}
