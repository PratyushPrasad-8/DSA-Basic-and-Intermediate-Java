package LinkedList;
public class SwappingNodes{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    
    public static void swap(int x,int y){
        Node temp=head;
        Node prev=null;
        
        Node a=null,b=null,preva=null,prevb=null;
        while(temp!=null){
            if(temp.data==x){
                preva=prev;
                a=temp;
            }

            
            if(temp.data==y){
                prevb=prev;
                b=temp;
            }
            
            prev=temp;
            temp=temp.next;
        }
        
        if(preva==null){
            prevb.next=b.next;
            b.next=a.next;
            a.next=prevb.next;
            prevb.next=a;
            
            head=b;
            return;
        }
        
        //swapping
        preva.next=b;
        prevb.next=b.next;
        b.next=a.next;
        
        a.next=prevb.next;
        prevb.next=a;
    }
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void mian(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        int x=1, y=4;
        
        print();
        swap(x,y);
        print();
    }
}