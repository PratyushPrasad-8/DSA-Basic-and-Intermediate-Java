package Heap;
import java.util.PriorityQueue;
import java.util.Comparator;

public class WeakestSoldier{
    public static class Bundle implements Comparable<Bundle>{
        int numberOfSoldiers;
        int idx;
        
        Bundle(int m,int n){
            numberOfSoldiers=m;
            idx=n;
        }
        
        @Override public int compareTo(Bundle b2){
            if(b2.numberOfSoldiers==this.numberOfSoldiers){
                return this.idx-b2.idx;
            }else{
                return b2.numberOfSoldiers-this.numberOfSoldiers;
            }
        }
    }
    
    public static void main(){
        int M=4;
        int N=4;
        int k=2;
        
        int arr[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
                     
        PriorityQueue<Bundle> pq= new PriorityQueue<>();
        
        for(int i=0;i<M;i++){
            int numberOfSoldiers=0;
            for(int j=0;j<N;j++){
                if(arr[i][j]==1){
                    numberOfSoldiers++;
                }
            }
            
            pq.add(new Bundle(numberOfSoldiers,i));
        }
        
        for(int i=0;i<k;i++){
            System.out.print("ROW"+pq.remove().idx+" ");
        }
    }
}