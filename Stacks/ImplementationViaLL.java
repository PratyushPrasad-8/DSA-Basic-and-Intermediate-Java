package Stacks;
public class ImplementationViaLL{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public int size=0;
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void push(int data){
        size++;
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    public int pop(){
        size--;
        if(head==null)
        return -1;
        
        int val=head.data;
        head=head.next;
        return val;
    }
    
    public int peek(){
        if(head==null)
        return -1;
        
        return head.data;
    }
    
    public int size(){
        return size;
    }
}