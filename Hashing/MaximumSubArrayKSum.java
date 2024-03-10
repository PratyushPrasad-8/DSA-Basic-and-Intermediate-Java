package Hashing;
import java.util.HashMap;

public class MaximumSubArrayKSum{
    public static void main(){
        int arr[]={10,2,-2,-20,-10};//20 10 -10 -30
        int k=-10;
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        int sum=0;
        int finalAns=0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                finalAns+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);            
        }
        
        System.out.println(finalAns);
    }
}