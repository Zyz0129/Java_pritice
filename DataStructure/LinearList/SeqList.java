package DataStructre.LinearList;

import java.util.Arrays;

public class SeqList<T> {
    //记录元素的数组
     public T[] arr;
    //记录当前数组中的元素个数
     public int N;
    //构造方法
    public SeqList(int max){
        this.arr= (T[]) new Object[max];
        this.N=0;
        //初始化数组
    }
    public void clear(){
        //将数组置空
        this.N=0;
    }
    public boolean isEmpty(){
        //判断数组是否为空
        return this.N==0;
    }
    public boolean isFull(){
        //判断数组是否为满
        return this.N==this.arr.length;
    }
    public int length(){
        //求当前数组长度
        return this.N;
    }
    public T get(int i){
        //获取数组中下标为i的元素
        return arr[i];
    }
    public void insert(T t){
        //向数组中添加一个元素
        if(isFull()){
            return;
        }else{
            this.arr[this.N++]=t;
        }
    }
    public void insert(T t,int i){
        //向数组中下标为i的位置添加一个元素
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
        //删除指定下标元素并返回该元素
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
        //查询某元素在数组中第一次出现的位置下标
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
