package LinkedList;
public class RemoveNthTermFromEnd_Pmethod{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int c;
    
    public int calSize(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public Node RemoveFromEndPos(Node temp,int pos){
        if(temp==null)
        return null;
        
        Node node=RemoveFromEndPos(temp.next,pos);

        if(node!=null)
        return node;
        
        c++;
        if(c==pos)
        return temp;
        
        return null;
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
        RemoveNthTermFromEnd_Pmethod ob = new RemoveNthTermFromEnd_Pmethod();
        ob.head=new Node(1);
        Node temp=head;
        for(int i=2;i<=5;i++){
            Node newNode=new Node(i);
            temp.next=newNode;
            temp=temp.next;
        }
        
        int pos=1;
        temp=ob.RemoveFromEndPos(head,pos+1);
        temp.next=temp.next.next;
        ob.print();
    }
}
