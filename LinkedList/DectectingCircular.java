package LinkedList;
public class DectectingCircular{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static boolean isCircular(){
        Node temp=head;
        while(temp!=null){
            if(temp.next==head)
            return true;
            
            temp=temp.next;
        }
        
        return false;
    }
    
    public static void main(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        //head.next.next.next.next=head.next;
        
        System.out.println(isCircular());
    }
}