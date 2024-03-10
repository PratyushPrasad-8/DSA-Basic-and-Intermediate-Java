package Heap;
import java.util.PriorityQueue;

public class ConnectNRopes{
    public static void main(){
        int ropes[]={4,3,2,6};
        
        int ans=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);    
        }
        
        while(!pq.isEmpty()){
            int x=pq.remove();
            
            if(pq.isEmpty())
            break;
            
            int y=pq.remove();
            int sum=x+y;
            ans+=sum;
            pq.add(sum);
        }
        
        System.out.println(ans);
    }
}