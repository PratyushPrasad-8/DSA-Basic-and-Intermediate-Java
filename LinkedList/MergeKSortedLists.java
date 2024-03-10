package LinkedList;
public class MergeKSortedLists{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static Node sort(Node head1,Node head2){
        Node temp=new Node(-1);
        Node sorted=temp;
        
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        
        if(head1!=null)
        temp.next=head1;
        
        if(head2!=null)
        temp.next=head2;
        
        return sorted.next;
    }
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String args[]){
        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        head=arr[0];
        print();
        
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
        head=arr[1];
        print();
        
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
        head=arr[2];
        print();
        
        head=arr[0];
        for(int i=1;i<k;i++){
            head=sort(head,arr[i]);
        }
        
        print();
    }
}