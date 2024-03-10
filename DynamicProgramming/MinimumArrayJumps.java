package DynamicProgramming;

public class MinimumArrayJumps{
    public static int findMin(int arr[],int idx,int n){
        if(idx>=n){
            return -1;
        }else if(idx==n-1){
            return 0;
        }
        
        int finalAns=Integer.MAX_VALUE;
        for(int i=1;i<=arr[idx];i++){
            int currAns=findMin(arr,idx+i,n);
            if(currAns!=-1){
                finalAns=Math.min(finalAns,currAns);    
            }
        }
        
        return 1+finalAns;
    }
    
    public static void main(){
        int arr[]={2,3,1,1,4};
        int n=arr.length;
        
        System.out.println(findMin(arr,0,n));
    }
}