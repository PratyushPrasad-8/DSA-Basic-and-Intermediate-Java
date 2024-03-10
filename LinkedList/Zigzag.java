package LinkedList;
public class Zigzag{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static Node getMid(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public static Node reverse(Node temp){
        Node prev=null;
        Node curr=temp;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    
    public static void doZigzag(Node leftHead,Node rightHead){        
        Node head=leftHead;
        Node nextLeft,nextRight;

        while(rightHead!=null && leftHead!=null){
            nextLeft=leftHead.next;
            leftHead.next=rightHead;
            nextRight=rightHead.next;
            rightHead.next=nextLeft;
            
            leftHead=nextLeft;
            rightHead=nextRight;
        }
    }
    
    public static void zigZag(){
        Node mid=getMid();
        
        Node rightHead=reverse(mid.next);
        Node leftHead=head;
        mid.next=null;
        
        doZigzag(leftHead,rightHead);
    }
    
    public static void main(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        //head.next.next.next.next.next=new Node(6);
        
        print();
        zigZag();
        print();
    }
}