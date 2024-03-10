package LinkedList;
public class DectectingCycle{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static boolean isCycle(){
        Node turtle=head;
        Node hare=head;
        
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        
        System.out.println(isCycle());
    }
}