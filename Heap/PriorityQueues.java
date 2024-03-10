package Heap;
import java.util.ArrayList;

public class PriorityQueues{
    static ArrayList<Integer> arr= new ArrayList<>();
    
    public static void add(int data){
        arr.add(data);
        
        int child=arr.size()-1;
        int parent=(child-1)/2;
        while( child!=0 && arr.get(child)<arr.get(parent)){
            int temp=arr.get(child);
            arr.set(child,arr.get(parent));
            arr.set(parent,temp);
            
            child=parent;
            parent=(child-1)/2;
        }
    }
    
    public static int peek(){
        return arr.get(0);
    }
    
    public static int remove(){
        int data=arr.get(0);
        
        int temp=arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);
        
        arr.remove(arr.size()-1);
        
        heapify(0);
        return data;
    }
    
    public static void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int min=i;
        
        if(left>=arr.size() || right>=arr.size()){
            return;
        }
        
        min=(arr.get(i)>arr.get(left))?left:i;
        min=(arr.get(i)>arr.get(right))?right:i;
        
        if(min!=i){
            int temp=arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i,temp);
            
            heapify(min);
        }
    }
    
    public static void main(){
        PriorityQueues pq = new PriorityQueues();
        
        pq.add(3);
        pq.add(2);
        pq.add(1);
        
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}