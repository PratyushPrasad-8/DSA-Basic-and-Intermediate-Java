package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueViaJCF{
    public static void mian(){
        Queue<Integer> q=new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove()+" "+q.remove()+" "+q.remove()+" "+q.remove());
    }
}