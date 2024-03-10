package Heap;
import java.util.PriorityQueue;

public class NearestCars{
    static class Cars{
        int result;
        int idx;
        
        Cars(int result,int idx){
            this.result=result;
            this.idx=idx;
        }
    }
    
    public static void main(){
        int coOrdinates[][]={{3,3},{5,1},{-2,4}};
        
        PriorityQueue <Cars> pq= new PriorityQueue<>((a,b)->a.result-b.result);
        for(int i=0;i<coOrdinates.length;i++){
            int currDist=(int)Math.sqrt(Math.pow(coOrdinates[i][0],2)+Math.pow(coOrdinates[i][1],2));
            pq.add(new Cars(currDist,i));
        }
        
        
        for(int i=0;i<2;i++){
            System.out.print("C"+pq.remove().idx+" ");
        }
    }
}
