package Hashing;
import java.util.HashSet;

public class UnionIntersection{
    public static void main(){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("UNION = "+hs.size()+" ("+hs+")");
        
        hs.clear();
        int intersection=0;
        
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                intersection++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("INTERSECTION = "+intersection+" (-"+"-)");
    }
}