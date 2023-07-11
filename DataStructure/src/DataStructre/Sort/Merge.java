package DataStructre.Sort;

public class Merge {
    //����һ����������
    private static Comparable[] assit;
    //������������еݹ��������ʼ��
    public static void sort(Comparable[] a){
        assit=new Comparable[a.length];
        int low=0;
        int high=a.length-1;
        //����������
        sort(a,low,high);
    }
    public static void sort(Comparable[] a,int low,int high){
        //�ݹ�Ľ�����־
        if(low>=high){
            return;
        }
        //ÿ�ζ�����������и�
        int mid=(low+high)/2;
        //���и������߽�������
        sort(a,low,mid);
        //���и����Ұ�߽�������
        sort(a,mid+1,high);
        //��ʼ�ع飬���й鲢
        merge(a,low,mid,high);
    }
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }
    public static void merge(Comparable[] a,int low,int mid,int high){
        //��������ָ��
        int i=low;//�����������ʼλ��
        int p1=low;//���������ʼλ��
        int p2=mid+1;//���������ʼλ��
        //����������Ĵ�С���бȽϣ�С�ķŽ��������飨��ʽ������̣�
        while(p1<=mid && p2<=high){
            if(less(a[p1],a[p2])){
                assit[i++]=a[p1++];
            }else{
                assit[i++]=a[p2++];
            }
        }
        //p2��ͷ�ˣ�p1û��ͷ�����
        while(p1<=mid){
            assit[i++]=a[p1++];
        }
        //p1��ͷ�ˣ�p2û��ͷ�����
        while(p2<=high){
            assit[i++]=a[p2++];
        }
        //�Ѹ��������е�Ԫ�ؿ�����ԭ������
        for (int index = low; index <= high; index++) {
            a[index]=assit[index];
        }
    }
}
