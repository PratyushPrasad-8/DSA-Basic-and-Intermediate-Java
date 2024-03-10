package DynamicProgramming;

public class MinimumPartitioning{
    public static int minDiff(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];    
        }
        
        int W=sum/2;
        int dp[][]=new int[n+1][W+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int val=arr[i-1];
                if(val<=j){
                    dp[i][j]=Math.max(val+dp[i-1][j-val],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        int set1=dp[n][W];
        int set2=sum-dp[n][W];
        return set2-set1;
    }
    
    public static void main(){
        int arr[]={1,10,11,5};
        int n=arr.length;
        
        System.out.println(minDiff(arr,n));
    }
}