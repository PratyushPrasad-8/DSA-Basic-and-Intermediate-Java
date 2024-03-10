package Heap;
import java.util.PriorityQueue;

public class KthLargestElementInStream{
    public static void main(){
        int stream[]={10, 20, 11, 70, 50, 40, 100, 5};
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        for(int i=0;i<stream.length;i++){
            pq.add(stream[i]);
            
            if(pq.size()<3){
                System.out.print(" - ");
            }else if(pq.size()==3){
                System.out.print(pq.peek()+" ");
            }else{
                pq.remove();
                System.out.print(pq.peek()+" ");
            }
        }
    }
}
