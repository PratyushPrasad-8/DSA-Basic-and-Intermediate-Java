package Arrays;

import java.util.*;
public class TrappedRainWater{
    public static int getTrappedWater(int arr[],int width){
        int n=arr.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++)
        leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        
        int tw=0;
        for(int i=1;i<n-1;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            tw+=(waterLevel-arr[i])*width;
        }
        
        return tw;
    }
    public static void main(){
        int arr[]={4,2,0,6,3,2,5};
        int width=1;
        
        System.out.println("TRAPPED WATER IS : "+getTrappedWater(arr,width));
    }
}