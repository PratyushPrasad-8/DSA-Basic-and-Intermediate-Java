package Heap;
import java.util.PriorityQueue;

public class MergeKSortedLL{
    static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    
    public static Node join(PriorityQueue<Node> pq){
        if(pq.isEmpty()){
            return null;
        }
        
        Node temp=pq.remove();
        temp.next=join(pq);
        return temp;
    }
    
    public static void main(){
        Node head1=new Node(5);
                head1.next=new Node(9);
                head1.next.next=new Node(11);
                head1.next.next.next=new Node(29);
        Node head2=new Node(7);
                head2.next=new Node(13);
                head2.next.next=new Node(17);
        Node head3=new Node(11);
                head3.next=new Node(21);
                head3.next.next=new Node(23);
                head3.next.next.next=new Node(26);      
        
        Node arr[]={head1,head2,head3};
        PriorityQueue<Node> pq= new PriorityQueue<>((a,b)-> a.data-b.data); 
        
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=null){
                pq.add(arr[i]);
                arr[i]=arr[i].next;
            }
        }
        
        Node head=join(pq);
        
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("NULL");
    }
}