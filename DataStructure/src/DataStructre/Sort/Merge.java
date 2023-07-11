package DataStructre.Sort;

public class Merge {
    //建立一个辅助数组
    private static Comparable[] assit;
    //对排序数组进行递归的条件初始化
    public static void sort(Comparable[] a){
        assit=new Comparable[a.length];
        int low=0;
        int high=a.length-1;
        //方法的重载
        sort(a,low,high);
    }
    public static void sort(Comparable[] a,int low,int high){
        //递归的结束标志
        if(low>=high){
            return;
        }
        //每次都对数组进行切割
        int mid=(low+high)/2;
        //对切割后的左半边进行排序
        sort(a,low,mid);
        //对切割后的右半边进行排序
        sort(a,mid+1,high);
        //开始回归，进行归并
        merge(a,low,mid,high);
    }
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }
    public static void merge(Comparable[] a,int low,int mid,int high){
        //定义三个指针
        int i=low;//辅助数组的起始位置
        int p1=low;//左子组的起始位置
        int p2=mid+1;//右子组的起始位置
        //对两个自组的大小进行比较，小的放进辅助数组（正式排序过程）
        while(p1<=mid && p2<=high){
            if(less(a[p1],a[p2])){
                assit[i++]=a[p1++];
            }else{
                assit[i++]=a[p2++];
            }
        }
        //p2到头了，p1没到头的情况
        while(p1<=mid){
            assit[i++]=a[p1++];
        }
        //p1到头了，p2没到头的情况
        while(p2<=high){
            assit[i++]=a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for (int index = low; index <= high; index++) {
            a[index]=assit[index];
        }
    }
}
