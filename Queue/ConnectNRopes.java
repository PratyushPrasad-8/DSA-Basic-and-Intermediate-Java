package Queue;
import java.util.PriorityQueue;

public class ConnectNRopes{
    public static int findMinCost(int ropes[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans=0;
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        
        while(pq.size()>1){
            int sum=pq.poll()+pq.poll();
            ans+=sum;
            pq.add(sum);
        }
        
        return ans;
    }
    public static void main(){
        int ropes[]={6,3,2,4};
        
        System.out.println("MINIMUM COST : "+findMinCost(ropes));
    }
}