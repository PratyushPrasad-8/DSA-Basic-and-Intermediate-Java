package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class StackViaTwoQueues{
    public static class Queues{
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        
        public void add(int data){
            if(!q1.isEmpty()){
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }else{
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
        }
        
        public int remove(){
           if(!q1.isEmpty()){
               return q1.remove();
           }else{
               return q2.remove();
           }
        }
        
        public int peek(){
            if(!q1.isEmpty()){
               return q1.peek();
           }else{
               return q2.peek();
           }
        } 
    }
    
    public static void main(){
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove()+" "+q.remove()+" "+q.remove()+" "+q.remove());    
    }
}