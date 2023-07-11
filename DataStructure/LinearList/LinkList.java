package DataStructre.LinearList;

public class LinkList<T> {
    private class Node{
         T data;
         Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private int N;

    public LinkList(){
        //链表的构造方法，也就是对链表进行初始化
        //创建头节点
        head=new Node(null,null);
        //个数为0
        N=0;
    }
    public void clear(){
        //置空链表
        head.next=null;
        N=0;
    }
    public boolean isEmpty(){
        //判断链表是否为空
        return N==0;
    }

    public int length(){
        //求链表中元素个数
        return N;
    }
    public T get(int i){
        //获取链表中第i个元素
        Node n=head;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.data;
    }
    public void insert(T t){
        //向链表中添加一个元素
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        Node newnode=new Node(t,null);
        n.next=newnode;
        N++;
    }
    public void insert(T t,int i){
        //向链表的指定位置位置添加一个元素
        Node pre=head;
        for(int index=0;index<i-1;index++){
            pre=pre.next;
        }
        Node curr=pre.next;
        Node newnode=new Node(t,curr);
        pre.next=newnode;
        N++;
    }
    public T remove(int i){
        //删除链表中的第i个元素并返回该元素
        Node pre=head;
        for(int index=0;index<i-1;index++){
            pre=pre.next;
        }
        Node dele=pre.next;
        Node nex=dele.next;
        pre.next=nex;
        dele.next=null;
        return dele.data;
    }
    public int indexOf(T t){
        //查询某元素在链表中第一次出现的位置
        int i=1;
        Node n=head;
        while(n.next!=null){
            n=n.next;
            if(n.data.equals(t)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public void ergodic(){
        //遍历链表
        Node n=head;
        while(n.next!=null){
            n=n.next;
            System.out.print(n.data+" ");
        }
    }
    public void reverse(){
        if(isEmpty()){
            return;
        }
        reverse(head.next);
    }
    public Node reverse(Node curr){
        if(curr.next==null){
            head.next=curr;
            return curr;
        }
        Node pre=reverse(curr.next);
        pre.next=curr;
        curr.next=null;
        return curr;
    }
}
