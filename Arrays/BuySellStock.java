package Arrays;

import java.util.*;
public class BuySellStock{
    public static int buySell(int arr[]){
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>min){
                int profit=arr[i]-min;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
            min=arr[i];
        }
        
        return maxProfit;
    }
    public static void main(){
        int arr[]={7,1,5,3,6,4};
        
        System.out.println(buySell(arr));
    }
}