package Queue;
public class CircularQueueViaArray{
    public static class Queue{
        int q[],front,rear,size;
        Queue(int size){
            this.size=size;
            front=rear=-1;
            q=new int[size];
        }
        
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        
        public void add(int data){
            if(isFull()){
                System.out.println("QUEUE OVERFLOW");
                return;
            }
            
            if(front==-1){
                front=0;
            }
            
            rear=(rear+1)%size;
            q[rear]=data;
        }
        
        public int remove(){
            if(isEmpty()){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            int val=q[front];
            if(rear==front){
                front=rear=-1;
            }else{
                front++;
            }
            return val;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            return q[front];
        }
    }
    
    public static void main(){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove()+" "+q.remove()+" "+q.remove()+" "+q.remove());
    }
}