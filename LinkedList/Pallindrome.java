package LinkedList;
public class Pallindrome{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    
    public Node findMid(){
        Node turtle=head;
        Node hare=head;
        
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        
        return turtle;
    }
    
    public Node reverse(Node mid){
        Node prev=null;
        Node curr=mid;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    
    public boolean check(Node left,Node right){
        while(left!=null && right!=null){
            if(left.data!=right.data){
                return false;                
            }
            
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
    public boolean isPallindrome(){
        Node mid=findMid();
        Node temp=reverse(mid);
        
        Node right=temp;
        Node left=head;
        
        return check(left,right);
    }
    
    public static void main(){
        Pallindrome ob = new Pallindrome();
        
        ob.head=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(5);
        Node node3=new Node(1);
        
        head.next=node1;
        node1.next=node2;
        node2.next=node3;

        
        System.out.println(ob.isPallindrome());
    }
}