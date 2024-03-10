package Queue;
public class QueueViaLL{
    public static class Queue{
        class Node{
            int data;
            Node next;
            
            Node(int data){
                this.data=data;
                next=null;
            }
        }
        Node head,tail;
        public boolean isEmpty(){
            return head==null;
        }
        
        public void add(int data){
            Node newNode=new Node(data);
            
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            
            tail.next=newNode;
            tail=newNode;
        }
        
        public int remove(){
            if(isEmpty()){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            int val=head.data;
            
            if(head.next==null){
                head=tail=null;
            }else{
                head=head.next;
            }
            
            return val;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            return head.data;
        }
    }
    
    public static void main(){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove()+" "+q.remove()+" "+q.remove()+" "+q.remove());
    }
}