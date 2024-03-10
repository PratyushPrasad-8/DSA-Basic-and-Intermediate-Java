package Heap;
import java.util.PriorityQueue;
import java.util.Comparator;

public class MinimumOperationsTwoHalveArraySum{
    public static void main(){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int arr[]={1,5,8,19};
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            pq.add(arr[i]);
        }
        
        int stop=sum/2;
        int ans=0;
        while(sum>stop && !pq.isEmpty()){
            int curr=pq.remove();
            sum=sum-curr+(curr/2);
            curr/=2;
            pq.add(curr);
            ans++;
        }
        
        System.out.println(ans);
    }
}