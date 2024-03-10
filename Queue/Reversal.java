package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Reversal{
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int val=q.remove();
        reverse(q);
        q.add(val);
    }
    public static void main(){
        Queue<Integer> q=new LinkedList<>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
}