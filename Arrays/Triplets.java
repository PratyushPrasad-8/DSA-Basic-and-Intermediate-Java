package Arrays;

import java.util.*;
public class Triplets{
    public static void triplets(int arr[]){
        HashSet <ArrayList> obj= new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        ArrayList<Integer> ob= new ArrayList<>();
                        ob.add(arr[i]);
                        ob.add(arr[j]);
                        ob.add(arr[k]);
                        Collections.sort(ob);
                        obj.add(ob);
                    }
                }
            }
        }
        
        System.out.println(obj);
    }
    
    public static void main(){
        int arr[]={-1, 0,  1, 2, -1, -4};
        
        triplets(arr);
    }
}