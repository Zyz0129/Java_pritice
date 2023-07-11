package DataStructre.Sort;

public class Insertion {
    public static void sort(Comparable[]a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(bigger(a[j-1],a[j])){
                    exchange(a,j,j-1);
                }else{
                    break;
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
