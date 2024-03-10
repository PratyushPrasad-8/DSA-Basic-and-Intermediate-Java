package DynamicProgramming;

public class TargetSum{
    public static boolean isTargetSumTab(int arr[],int W){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][W+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int val=arr[i-1];
                if(val<=j){
                    if(dp[i-1][j-val]){
                        dp[i][j]=true;
                    }
                    if(dp[i-1][j]){
                        dp[i][j]=true;
                    }
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][W];
    }
    
    public static boolean isTargetSumMem(int arr[],int W,int n,boolean dp[][]){
        if(W==0){
            return true;
        }
        
        if(n==0){
            return false;
        }
        
        if(dp[n][W]){
            return true;
        }
        
        int val=arr[n-1];
        if(val<=W){
            return dp[n][W]=isTargetSumMem(arr,W-val,n-1,dp) || isTargetSumMem(arr,W,n-1,dp);
        }else{
            return dp[n][W]=isTargetSumMem(arr,W,n-1,dp);
        }
    }
    
    public static void main(){
        int arr[]={4,2,7,1,3};
        int W=10;
        int n=arr.length;
        
        System.out.println(isTargetSumTab(arr,W));
        System.out.println(isTargetSumMem(arr,W,n,new boolean[n+1][W+1]));
    }
}