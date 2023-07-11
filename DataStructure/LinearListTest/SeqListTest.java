package DataStructre.LinearListTest;

import DataStructre.LinearList.SeqList;

public class SeqListTest {
    public static void main(String[] args) {
        SeqList <Integer> arr=new SeqList<>(100);
        int a=987654321;
        while(a!=0){
            int s=a%10;
            arr.insert(s);
            a/=10;
        }
        System.out.println(arr.isEmpty());
        System.out.println(arr.isFull());
        arr.insert(100,3);
        System.out.println(arr.get(4));
        System.out.println(arr.indexOf(8));
        System.out.println(arr.remove(1));
        System.out.println(arr.length());
        arr.ergodic();
        System.out.println("-------------------");
        arr.clear();
        arr.ergodic();
    }
}
