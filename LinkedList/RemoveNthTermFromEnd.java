package LinkedList;
public class RemoveNthTermFromEnd{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    
    public int calSize(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public void RemoveFromEndPos(int pos){
        int size=calSize();
        if(pos==size){
            head=head.next;
            return;
        }
        
        int index=size-pos-1;
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(i==index)
            break;
            
            temp=temp.next;
            i++;
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
        RemoveNthTermFromEnd ob = new RemoveNthTermFromEnd();
        ob.head=new Node(1);
        Node temp=head;
        for(int i=2;i<=5;i++){
            Node newNode=new Node(i);
            temp.next=newNode;
            temp=temp.next;
        }
        
        int pos=4;
        ob.RemoveFromEndPos(pos);
        ob.print();
    }
}
