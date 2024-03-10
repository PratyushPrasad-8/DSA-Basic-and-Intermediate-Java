package Recursion;

import java.util.*;
public class KSizeCobinations{
    public static int generateCombinations(int st,int end,ArrayList<Integer> current,int k,int arr[],int mindiff){
        if(current.size()==k){
            System.out.print(current);
            System.out.print(Collections.max(current)+" "+Collections.min(current));
            mindiff=Math.min(mindiff,(Collections.max(current)-Collections.min(current)));
            System.out.println("   "+mindiff);
            return mindiff;
        }
        
        for(int i=st;i<=end;i++){
            current.add(arr[i]);
            mindiff=generateCombinations(i+1,end,current,k,arr,mindiff);
            current.remove(current.size()-1);
        }
        
        return mindiff;
    }
    
    public static void main(){
        int arr[]={10,100,300,200,1000,20,30};

        int k=3;
        
        System.out.println(generateCombinations(0,6,new ArrayList<>(),k,arr,Integer.MAX_VALUE));
    }
}