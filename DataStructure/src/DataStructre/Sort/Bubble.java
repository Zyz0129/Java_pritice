package DataStructre.Sort;

import java.util.Arrays;

public class Bubble {
    public static void sort(Comparable[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(bigger(a[j],a[j+1])){
                    exchange(a,j,j+1);
                }
            }
        }
    }
    public static boolean bigger(Comparable a, Comparable b){
        //比较两个元素的大小
        return a.compareTo(b)>0;
    }
    public static void exchange(Comparable[] a,int i,int j){
        //用于两个元素的交换
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}
