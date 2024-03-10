package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseFirstKelementsOfQueue{
    public static void main(){
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        int k=7;
        q.add(1);q.add(2);
        q.add(3);q.add(4);
        q.add(5);q.add(6);
        q.add(7);q.add(8);
        q.add(9);q.add(10);
        int n=q.size();
        
        System.out.println(q);
        for(int i=1;i<=k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}