package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class StackViaDeque{
    public static void main(){
        Deque deq=new LinkedList<>();
        
        deq.addLast(1);
        deq.addLast(2);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq.getLast());
        System.out.println(deq.removeLast()+" "+deq.removeLast()+" "+deq.removeLast()+" "+deq.removeLast());
    }
}