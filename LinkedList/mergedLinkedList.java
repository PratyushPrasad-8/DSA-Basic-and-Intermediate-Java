package LinkedList;
public class mergedLinkedList{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head1;
    public static Node head2;
    
    public static Node findMerge(){
        Node temp1=head1;
        
        while(temp1!=null){
            Node temp2=head2;
            while(temp2!=null){
                if(temp1==temp2)
                return temp1;
                
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        
        return null;
    }
    
    public static void main(){
        mergedLinkedList ll1=new mergedLinkedList();
        mergedLinkedList ll2=new mergedLinkedList();
        
        ll1.head1=new Node(1);ll2.head2=new Node(4);
        
        Node node2=new Node(2);head1.next=node2;
        Node node3=new Node(3);node2.next=node3;

        Node node5=new Node(5);head2.next=node5;
        Node node6=new Node(6);node3.next=node6;node5.next=node6;
        Node node7=new Node(7);node6.next=node7;
        
        Node mergedNode=findMerge();
        if(mergedNode==null){
            System.out.println("NO MERGE POINT FOUND");
        }else{
            System.out.println(mergedNode.data);
        }
    }
}