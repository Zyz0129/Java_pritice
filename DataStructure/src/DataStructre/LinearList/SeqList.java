package DataStructre.LinearList;

import java.util.Arrays;

public class SeqList<T> {
    //��¼Ԫ�ص�����
     public T[] arr;
    //��¼��ǰ�����е�Ԫ�ظ���
     public int N;
    //���췽��
    public SeqList(int max){
        this.arr= (T[]) new Object[max];
        this.N=0;
        //��ʼ������
    }
    public void clear(){
        //�������ÿ�
        this.N=0;
    }
    public boolean isEmpty(){
        //�ж������Ƿ�Ϊ��
        return this.N==0;
    }
    public boolean isFull(){
        //�ж������Ƿ�Ϊ��
        return this.N==this.arr.length;
    }
    public int length(){
        //��ǰ���鳤��
        return this.N;
    }
    public T get(int i){
        //��ȡ�������±�Ϊi��Ԫ��
        return arr[i];
    }
    public void insert(T t){
        //�����������һ��Ԫ��
        if(isFull()){
            return;
        }else{
            this.arr[this.N++]=t;
        }
    }
    public void insert(T t,int i){
        //���������±�Ϊi��λ�����һ��Ԫ��
        if(isFull()){
            return;
        }else{
            for(int k=this.N-1;k>=i;k--){
                this.arr[k+1]=this.arr[k];
            }
            this.arr[i]=t;
            N++;
        }
    }
    public T remove(int i){
        //ɾ��ָ���±�Ԫ�ز����ظ�Ԫ��
        if(i>this.N-1){
            return null;
        }else{
            T current=this.arr[i];
            for(int k=i;k<N;k++){
                this.arr[k]=this.arr[k+1];
            }
            N--;
            return current;
        }
    }
    public int indexOf(T t){
        //��ѯĳԪ���������е�һ�γ��ֵ�λ���±�
        for (int i = 0; i < this.arr.length; i++) {
            if(arr[i].equals(t)){
                return i;
            }
        }
        return -1;
    }
    public void ergodic(){
        for (int i = 0; i < this.N; i++) {
            System.out.println(this.arr[i]);
        }
    }
}
