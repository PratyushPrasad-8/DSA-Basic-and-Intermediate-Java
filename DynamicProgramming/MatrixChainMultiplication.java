package DynamicProgramming;

public class MatrixChainMultiplication{
    public static int maxCost(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        int finalCost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=maxCost(arr,i,k,dp);
            int cost2=maxCost(arr,k+1,j,dp);
            
            int cost3=arr[i-1]*arr[k]*arr[j];
            
            finalCost=Math.min(finalCost,cost1+cost2+cost3);
        }
        
        return dp[i][j]=finalCost;
    }
    
    public static void main(){
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        
        System.out.println(maxCost(arr,1,n-1,new int[n][n]));
    }
}