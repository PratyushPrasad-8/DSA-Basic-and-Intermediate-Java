package Heap;
import java.util.PriorityQueue;

public class SlidingWindowMaximum{
    static class Bundle{
        int data;
        int idx;
        
        Bundle(int data,int idx){
            this.data=data;
            this.idx=idx;
        }
    }
    
    public static void main(){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        
        PriorityQueue<Bundle> pq=new PriorityQueue<>((a,b)->b.data-a.data);
        for(int i=0;i<k-1;i++){
            pq.add(new Bundle(arr[i],i));
        }
        
        for(int i=k-1;i<arr.length;i++){
            pq.add(new Bundle(arr[i],i));
            
            while(!pq.isEmpty() && pq.peek().idx<i-k-1){
                pq.remove();
            }
            
            if(pq.isEmpty()){
                break;
            }
            
            System.out.print(pq.peek().data+" ");
        }
    }
}