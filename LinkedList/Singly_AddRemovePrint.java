package LinkedList;
public class Singly_AddRemovePrint{
    //node preperation
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static int size;
    
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
    }
    
    public void addLast(int data){
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
    }
    
    public void addMid(int data,int pos){
        if(head==null && pos!=0){
            System.out.println("WRONG INPUT");
            return;
        }
        
        Node newNode=new Node(data);
        
        if(head==null && pos==0){
            head=newNode;
            return;
        }
        
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        
        
        Node temp=head;int i=0;
        while(temp!=null){
            if(i==pos-1)
            break;
            
            temp=temp.next;
            i++;
        }
        
        if(temp==null){
            System.out.println("WRONG POSITION");
            return;
        }
        
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public void removeFirst(){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        head=head.next;
    }
    
    public void removeLast(){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        if(head.next==null){
            head=null;
            return;
        }
        
        Node prev=null;
        Node curr=head;

        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        
        prev.next=null;
    }
    
    public void removeMid(int pos){
        if(head==null){
            System.out.println("ALREADY EMPTY");
            return;
        }
        
        if(pos==0){
            head=head.next;
            return;
        }
        
        Node temp=head;int i=0;
        while(temp!=null){
            if(i==pos-1)
            break;
            
            i++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("WRONG POSITION");
            return;
        }
        
        temp.next=temp.next.next;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(){
        Singly_AddRemovePrint ob=new Singly_AddRemovePrint();
        
                        ob.print();
        ob.addFirst(1);
        ob.addFirst(2);        
                        ob.print();        
        ob.addLast(3);
        ob.addLast(4);        
                        ob.print();        
        ob.addMid(5,100);
        ob.addMid(5,2);
        ob.addMid(6,0);        
                        ob.print();        
        ob.addFirst(7);        
                        ob.print();
                        
        ob.removeFirst();
                        ob.print();
        ob.removeLast();
                        ob.print();
        ob.removeMid(100);
        ob.removeMid(0);
                        ob.print();
        ob.removeMid(2);
                        ob.print();
    }
}