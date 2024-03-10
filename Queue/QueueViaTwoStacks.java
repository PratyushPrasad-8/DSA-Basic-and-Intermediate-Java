package Queue;
import java.util.Stack;
public class QueueViaTwoStacks{
    public static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        public int remove(){
            if(!s1.isEmpty()){
                return s1.pop();
            }else{
                return s2.pop();
            }
        }
        
        public int peek(){
            if(!s1.isEmpty()){
                return s1.peek();
            }else{
                return s2.peek();
            }
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