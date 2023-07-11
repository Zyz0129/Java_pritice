package DataStructre.LinearList;

public class Queue <T>{
    private class Node{
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node last;
    private int N;
    public Queue(){
        head=new Node(null,null);
        last=null;
        N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public void enQueue(T t){
        if(isEmpty()){
            last=new Node(t,null);
            head.next=last;
        }else{
            Node n=new Node(t,null);
            last.next=n;
            last=n;
        }
        N++;
    }
    public T deQueue(){
        if(N==0){
            return null;
        }else if(N==1){
            Node curr=head.next;
            head=null;
            last=null;
            N=0;
            return curr.data;
        }else{
            Node curr=head.next;
            head.next=curr.next;
            N--;
            return curr.data;
        }
    }


















}
