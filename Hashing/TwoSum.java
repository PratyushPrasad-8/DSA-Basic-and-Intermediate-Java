package Hashing;
import java.util.HashMap;

public class TwoSum{
    public static void main(){
        //int arr[]={2, 7, 11, 15};
        int arr[]={3,2,4};
        //int target=9;
        int target=6;
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            
            if(hm.containsKey(target-curr)){
                System.out.println(hm.get(target-curr)+" and "+i);
            }else{
                hm.put(curr,i);
            }
        }
    }
}