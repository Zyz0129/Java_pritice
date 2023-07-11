package DataStructre.LinearList;

public class Stack <T> {
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
    public Stack(){
        head=new Node(null,null);
        N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public void push(T t){
        if(isEmpty()){
            Node newnode = new Node(t, null);
            head.next=newnode;
            N++;
        }else{
            Node newnode = new Node(t, head.next);
            head.next=newnode;
            N++;
        }
    }
    public T pop(){
        if(N==0){
            return null;
        } else if (N==1) {
            Node curr=head.next;
            head.next=null;
            N--;
            return curr.data;
        }else{
            Node curr=head.next;
            head.next=curr.next;
            N--;
            return curr.data;
        }
    }








}
