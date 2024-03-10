package Heap;

public class MinimumTimeNSlots{
    public static int minimumTime(int N,int arr[]){
        if(arr.length==0){
            return -1;
        }
        int maxTime=Integer.MIN_VALUE;
        

        maxTime=Math.max(arr[0]-1,maxTime);
        maxTime=Math.max(N-arr[arr.length-1],maxTime);
        
        if(arr.length==1){
            return maxTime;
        }
        
        for(int i=0;i<arr.length-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            
            maxTime=Math.max(maxTime,(b-a)/2);
        }
        
        return maxTime;
    }
    
    public static void main(){
        int N=6;
        int arr[]={2,6};
        
        int result=minimumTime(N,arr);
        
        if(result==-1){
            System.out.println("NOT POSSIBLE");
        }else{
            System.out.println("RESULT : "+result);            
        }

    }
}