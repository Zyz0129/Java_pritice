package DataStructre.Sort;

public class Shell {
    public static void sort(Comparable []a){
        //对h进行修正，修正为h的最大值
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1){
            for(int i=h;i<a.length;i++){
                for(int j=i;j>=h;j-=h){//每次跳跃一个h大小
                    if(bigger(a[j-h],a[j])){
                        exchange(a,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            h=h/2;
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
