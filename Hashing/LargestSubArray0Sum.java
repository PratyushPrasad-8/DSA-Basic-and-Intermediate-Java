package Hashing;
import java.util.HashMap;

public class LargestSubArray0Sum{
    public static void main(){
        int arr[]={15,-2,2,-8,1,7,10,23};
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int finalAns=0;
        
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(hm.containsKey(sum)){
                int currAns=Math.abs(i-hm.get(sum));
                finalAns=Math.max(finalAns,currAns);
            }else{
                hm.put(sum,i);
            }
        }
        
        System.out.println(finalAns);
    }
}