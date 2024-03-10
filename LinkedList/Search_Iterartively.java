package LinkedList;
public class Search_Iterartively{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    
    public int search(int key){
        Node temp=head;
        int pos=0;
        while(temp!=null){
            if(temp.data==key)
            return pos;
            
            temp=temp.next;
            pos++;
        }
        return -1;
    }
    
    public static void main(){
        Search_Iterartively ob = new Search_Iterartively();
        ob.head=new Node(1);
        Node temp=head;
        for(int i=2;i<=5;i++){
            Node newNode=new Node(i);
            temp.next=newNode;
            temp=temp.next;
        }
        
        int key=30;
        int index=ob.search(key);
        if(index==-1){
            System.out.println("KEY NOT FOUND");
        }else{
            System.out.println("KEY FOUND IN POSITION : "+index);
        }
    }
}