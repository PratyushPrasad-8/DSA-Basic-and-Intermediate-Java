package LinkedList;
public class Doubly_Reverse{
    public static class Node{
        int data;
        Node next,prev;
        
        Node(int data){
            this.data=data;
            next=prev=null;
        }
    }
    public static Node head;
    
    public Node reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(){
        Doubly_Reverse ob = new Doubly_Reverse();
        ob.head=new Node(1);
        Node temp=head;
        for(int i=2;i<=5;i++){
            Node newNode=new Node(i);
            temp.next=newNode;
            newNode.prev=temp;
            temp=temp.next;
        }
        
        System.out.println("ORIGINAL : ");
        ob.print();
        int key=3;
        head=ob.reverse();
        System.out.println("AFTER REVERSING : ");
        ob.print();
    }
}