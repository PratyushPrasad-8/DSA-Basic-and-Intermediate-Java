package LinkedList;
import java.util.LinkedList;
public class JCF{
    public static void main(){
        LinkedList<Integer> ll = new LinkedList<>();
        
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(1);
        
        ll.add(1,100);
        System.out.println(ll);
        
        System.out.println(ll.get(1));
        
        ll.set(1,200);
        System.out.println(ll);
        
        //ll.removeFirst();
        ll.remove(1);
        System.out.println(ll.size());
    }
}
