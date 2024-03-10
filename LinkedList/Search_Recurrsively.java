package LinkedList;
public class Search_Recurrsively{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    
    public int search(int key,Node temp,int pos){
        if(temp==null){
            return -1;
        }
        
        if(temp.data==key)
        return pos;
        
        return search(key,temp.next,pos+1);
    }
    
    public static void main(){
        Search_Recurrsively ob = new Search_Recurrsively();
        ob.head=new Node(1);
        Node temp=head;
        for(int i=2;i<=5;i++){
            Node newNode=new Node(i);
            temp.next=newNode;
            temp=temp.next;
        }
        
        int key=3;
        int index=ob.search(key,head,0);
        if(index==-1){
            System.out.println("KEY NOT FOUND");
        }else{
            System.out.println("KEY FOUND IN POSITION : "+index);
        }
    }
    
}