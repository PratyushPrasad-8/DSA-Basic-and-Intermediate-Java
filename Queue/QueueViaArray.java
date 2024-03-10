package Queue;
public class QueueViaArray{
    public static class Queue{
        static int q[],rear,size;
        Queue(int size){
            q=new int[size];
            rear=-1;
            this.size=size;
        }
        
        public static void add(int data){
            if(rear==size-1){
                System.out.println("QUEUE OVERFLOW");
                return;
            }
            
            rear+=1;
            q[rear]=data;
        }
        
        public static int remove(){
            if(rear==-1){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            int val=q[0];
            
            for(int i=0;i<rear;i++){
                q[i]=q[i+1];
            }
            rear--;
            return val;
        }
        
        public static int peek(){
            if(rear==-1){
                System.out.println("QUEUE UNDERFLOW");
                return -1;
            }
            
            return q[0];
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