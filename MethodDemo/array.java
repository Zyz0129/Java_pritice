package MethodDemo;

import java.util.Random;

public class array {
    public static void main(String[] args) {
        Random ran=new Random();
        int [] arr= {1,2,3,4,5};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int j= ran.nextInt(5);
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
