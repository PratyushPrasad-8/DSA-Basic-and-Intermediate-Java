package Hashing;
import java.util.HashMap;

public class MajorityElements{
    public static void mian(){
        //int arr[]={1,3,2,5,1,3,1,5,1};
        int arr[]={1,2};
        
        int n=arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(Integer key : hm.keySet()){
            if(hm.get(key)>n/3){
                System.out.print(key+" ");
            }
        }
    }
}