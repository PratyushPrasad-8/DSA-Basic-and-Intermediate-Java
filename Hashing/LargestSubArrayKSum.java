package Hashing;
import java.util.HashMap;

public class LargestSubArrayKSum{
    public static void main(){
        int arr[]={6,1,2,3,2,2,4,5};
        int k=6;
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int sum=0;
        int finalAns=0;
        
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                int currAns=i-hm.get(sum-k);
                finalAns=Math.max(finalAns,currAns);
            }else{
                hm.put(sum,i);
            }
        }
        
        System.out.println(finalAns);
    }
}