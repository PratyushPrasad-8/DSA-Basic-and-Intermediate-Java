package LinkedList;
public class OddEvenLinkedList{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static void separate(){
        Node odd=new Node(-1);
        Node eve=new Node(-1);
        
        Node oddHead=odd;
        Node eveHead=eve;
        
        Node temp=head;
        while(temp!=null){
            if(temp.data %2== 0){
                eve.next=temp;
                eve=eve.next;
            }else{
                odd.next=temp;
                odd=odd.next;
            }
            
            temp=temp.next;
        }
        odd.next=null;
        eve.next=oddHead.next;
        
        head=eveHead.next;
    }
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(){
        head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(9);
        head.next.next.next=new Node(8);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(4);
        
        print();
        separate();
        print();
    }
}