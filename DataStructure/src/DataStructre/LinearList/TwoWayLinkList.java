package DataStructre.LinearList;

public class TwoWayLinkList <T> {
    private class Node{
        T data;
        Node pre;
        Node next;

        public Node(T data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }
    private Node head;
    private Node last;
    private int N;
    public TwoWayLinkList(){
        head=new Node(null,null,null);
        last=new Node(null,null,null);
        N=0;
    }
    public void clear(){
        head=null;
        last=null;
        N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public T get(int i){
        Node n=head;
        for (int index = 0; index < i; index++) {
            n=n.next;
        }
        return n.data;
    }
    public void insert(T t){
        if(isEmpty()){
            Node newnode=new Node(t,head,null);
            head.next=newnode;
            last=newnode;
            N++;
        }else{
            Node newnode=new Node(t,last,null);
            last.next=newnode;
            last=newnode;
            N++;
        }
    }
    public void insert(T t,int i){
        Node pre=head;
        for (int index = 0; index < i-1; index++) {
            pre=pre.next;
        }
        Node curr=pre.next;
        Node newnode=new Node(t,pre,curr);
        pre.next=newnode;
        curr.pre=newnode;
        N++;
    }
    public T remove(int i){
        Node pre=head;
        for (int index = 0; index < i-1; index++) {
            pre=pre.next;
        }
        Node curr=pre.next;
        Node nex=curr.next;
        pre.next=nex;
        nex.pre=pre;
        N--;
        return curr.data;
    }
    public int indexOf(T t){
        Node n=head;
        int index=0;
        while(n!=null){
            n=n.next;
            index++;
            if(n.equals(t)){
                return index;
            }
        }
        return -1;
    }
    public void ergodic1(){
        Node n=head;
        while(n.next!=null){
            n=n.next;
            System.out.print(n.data+" ");
        }
        System.out.println();
    }
    public void ergodic2(){
        Node n=last;
        while(n.pre!=null){
            System.out.print(n.data+" ");
            n=n.pre;
        }
        System.out.println();
    }
}


















