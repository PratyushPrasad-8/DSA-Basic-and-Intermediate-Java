package LinkedList;
import java.util.LinkedList;
public class RetainMDeleteN{
    public static void main(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        //ll.add(10);
        int M=2,N=2;
        
        System.out.println(ll);
        
        for(int i=M;i<ll.size();i+=M){
            for(int j=1;j<=N;j++){
                if(i==ll.size())
                break;
                ll.remove(i);
            }
        }
        
        System.out.println(ll);
    }
}
