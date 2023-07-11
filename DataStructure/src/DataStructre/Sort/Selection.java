package DataStructre.Sort;

import java.util.Arrays;

public class Selection {
    public static void sort(Comparable[]a){
        for(int i=0;i<a.length-1;i++){
            int exindex=i;
            for(int j=i+1;j<a.length;j++){
                if(bigger(a[exindex],a[j])){
                    exindex=j;
                }
            }
            exchange(a,exindex,i);
        }
    }
    public static boolean bigger(Comparable a, Comparable b){
        //�Ƚ�����Ԫ�صĴ�С
        return a.compareTo(b)>0;
    }
    public static void exchange(Comparable[] a,int i,int j){
        //��������Ԫ�صĽ���
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
