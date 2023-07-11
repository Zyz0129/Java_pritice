package DataStructre.LinearListTest;

import DataStructre.LinearList.Stack;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack s=new Stack();
        int n=input.nextInt();
        while(n!=-1){
            s.push(n);
            n=input.nextInt();
        }
        System.out.println(s.isEmpty());
        System.out.println("-------");
        System.out.println(s.length());
        System.out.println("-------");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
