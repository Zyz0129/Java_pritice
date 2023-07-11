package DataStructre.Sort;

public class Quick {
    public static void sort(Comparable[] a){
        int low=0;
        int high=a.length-1;
        sort(a,low,high);
    }
    public static void sort(Comparable[] a,int low,int high){
        if(low>high){
            return;
        }
        int partition=partition(a,low,high);
        sort(a,low,partition-1);
        sort(a,partition+1,high);
    }
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }
    public static int partition(Comparable[] a,int low,int high){
        Comparable key=a[low];
        int left=low;
        int right=high+1;
        while (left<right){
            //先从右往左扫描，移动right指针，找到比主元小的值
            //再从左往右扫描，找到比主元大的值
            while(less(key,a[--right]) && left<right){
                if(right == low) break;
            }
            while (less(a[++left],key) && left<right){
                if(left == high) break;
            }
            if(left<right)
                exch(a,left,right);
        }
        exch(a,left,low);
        return left;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
