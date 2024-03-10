package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class InterLeave{
    public static void interLeave(Queue<Integer> q2){
        Queue<Integer> q1=new LinkedList<>();
        int size=q2.size();
        
        for(int i=0;i<(int)Math.ceil(size/2.0);i++){
            q1.add(q2.remove());
        }
        
        for(int i=0;i<(int)Math.ceil(size/2);i++){
            q2.add(q1.remove());
            q2.add(q2.remove());
        }
        if(!q1.isEmpty()){
            q2.add(q1.remove());
        }
    }
    public static void main(){
        Queue<Integer> q=new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        
        System.out.println(q);
        interLeave(q);
        System.out.println(q);
    }
}