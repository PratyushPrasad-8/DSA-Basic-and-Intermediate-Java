package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class QueueViaDeque{
    public static void main(){
        Deque deq=new LinkedList<>();
        
        deq.addLast(1);
        deq.addLast(2);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq.getFirst());
        System.out.println(deq.removeFirst()+" "+deq.removeFirst()+" "+deq.removeFirst()+" "+deq.removeFirst());
    }
}