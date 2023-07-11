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
        //����Ĺ��췽����Ҳ���Ƕ�������г�ʼ��
        //����ͷ�ڵ�
        head=new Node(null,null);
        //����Ϊ0
        N=0;
    }
    public void clear(){
        //�ÿ�����
        head.next=null;
        N=0;
    }
    public boolean isEmpty(){
        //�ж������Ƿ�Ϊ��
        return N==0;
    }

    public int length(){
        //��������Ԫ�ظ���
        return N;
    }
    public T get(int i){
        //��ȡ�����е�i��Ԫ��
        Node n=head;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.data;
    }
    public void insert(T t){
        //�����������һ��Ԫ��
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        Node newnode=new Node(t,null);
        n.next=newnode;
        N++;
    }
    public void insert(T t,int i){
        //�������ָ��λ��λ�����һ��Ԫ��
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
        //ɾ�������еĵ�i��Ԫ�ز����ظ�Ԫ��
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
        //��ѯĳԪ���������е�һ�γ��ֵ�λ��
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
        //��������
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
