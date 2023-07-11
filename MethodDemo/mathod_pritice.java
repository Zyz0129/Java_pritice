package MethodDemo;

import java.util.Scanner;

public class mathod_pritice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] arr=new int[5];
        int [] arr1=new int[5];//功能四中拷贝用的新数组
        System.out.print("请输入五个数:");
        int i,max,ch,find;
        for(i=0;i<5;i++){
            arr[i]=input.nextInt();
        }do {
            menu();
            System.out.print("请选择：");
            ch=input.nextInt();
            switch (ch) {
                case 1 -> walk(arr, arr.length);
                case 2 -> System.out.println(max(arr, arr.length));
                case 3 -> {
                    System.out.println("请输入要查询的数");
                    find = input.nextInt();
                    find(arr, arr.length, find);
                }
                case 4 -> {
                    copy(arr, arr1, arr.length);
                    walk(arr1, arr1.length);
                }
                default -> {
                }
            }
        }while(ch!=0);
    }
    //功能菜单
    public static void menu(){
        System.out.println("1.遍历数组");
        System.out.println("2.求最大值");
        System.out.println("3.查询某数");
        System.out.println("4.将数组复制一个出来并打印");
    }
    //遍历数组
    public static void walk(int []arr,int length){
        int i;
        for(i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //遍历求数组中最大值
    public static int max(int []arr, int length){
        int i;
        int maxx=arr[0];
        for(i=1;i<length;i++){
            if(arr[i]>maxx){
                maxx=arr[i];
            }
        }
        return maxx;
    }
    //判断数组中是否存在某一元素，若存在，返回该值与下标
    //不存在，返回-1
    public static void find(int []arr,int length,int n){
        int i;
        for(i=0;i<length;i++){
            if(arr[i]==n){
                System.out.println(arr[i]+"的下标为"+i);
                return;
            }
        }
    }
    //复制数组
    public static void copy(int []arr,int []arr1,int length){
        int i;
        for(i=0;i<length;i++){
            arr1[i]=arr[i];
        }
    }
}














