package LinkedList;
public class Doubly_AddRemovePrint{
    public static class Node{
        int data;
        Node next,prev;
        
        Node(int data){
            this.data=data;
            next=prev=null;
        }
    }
    public static Node head;
    
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;   
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        newNode.prev=temp;
    }
    
    public static void addMid(int pos,int data){
        Node newNode= new Node(data);
        if(head==null && pos==0){
            head=newNode;
            return;
        }
        
        Node temp=head;int i=0;
        while(temp!=null){
            if(i==pos)
            break;
            
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("WRONG POSITION");
            return;
        }
        
        if(i==0){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            
            return;
        }
        
        newNode.prev=temp.prev;
        temp.prev.next=newNode;
        newNode.next=temp;
        temp.prev=newNode;
    }
    
    public static void removeFirst(){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        if(head.next==null){
            head=null;
            return;
        }
        
        head=head.next;
        head.prev=null;
    }
    
    public static void removeLast(){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        if(head.next==null){
            head=null;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.prev.next=null;
    }
    
    public static void removeMid(int pos){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        if(head.next==null && pos==0){
            head=null;
            return;
        }
        
        Node temp=head;int i=0;
        while(temp!=null){
            if(i==pos)
            break;
            
            temp=temp.next;
            i++;
        }
        
        if(temp==null){
            System.out.println("WRONG POSITION");
            return;
        }
        
        if(temp.next==null){
            temp.prev.next=null;
            return;
        }
        
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        
        System.out.println("NULL");
    }
    
    public static void main(){
        addFirst(3);
        addFirst(2);
        addFirst(1);
                    print();
        addLast(4);
        addLast(5);
                    print();
        addMid(2,6);
        addMid(5,7);
                    print();
                    
        removeFirst();
                    print();
        removeLast();
                    print();
        removeMid(100);
        removeMid(2);
                    print();
    }
}