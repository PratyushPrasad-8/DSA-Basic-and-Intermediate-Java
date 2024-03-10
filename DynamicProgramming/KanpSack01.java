package DynamicProgramming;

public class KanpSack01{
    public static int maxProfit(int weights[],int values[],int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        
        int wt=weights[n-1];
        int val=values[n-1];
        if(wt<=W){
            int ans1=val+maxProfit(weights,values,W-wt,n-1);
            int ans2=maxProfit(weights,values,W,n-1);
            return Math.max(ans1,ans2);
        }else{
            return maxProfit(weights,values,W,n-1);
        }
    }
    
    public static int maxProfitMem(int weights[],int values[],int W,int n,int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        
        if(dp[n][W]!=0){
            return dp[n][W];
        }
        
        int wt=weights[n-1];
        int val=values[n-1];
        if(wt<=W){
            int ans1=val+maxProfit(weights,values,W-wt,n-1);
            int ans2=maxProfit(weights,values,W,n-1);
            return dp[n][W]=Math.max(ans1,ans2);
        }else{
            return dp[n][W]=maxProfit(weights,values,W,n-1);
        }
    }
    
    public static int maxProfitTab(int weights[],int values[],int W){
        int n=weights.length;
        int dp[][]=new int[n+1][W+1];
        
        //initialization not req here
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int wt=weights[i-1];
                int val=values[i-1];
                if(wt<=j){
                    dp[i][j]=Math.max(val+dp[i-1][j-wt],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][W];
    }
    
    public static void main(){
        int weights[]={2,5,1,3,4};
        int values[]={15,14,10,45,30};
        int W=7;
        
        int n=weights.length;
        System.out.println(maxProfit(weights,values,W,n));
        System.out.println(maxProfitMem(weights,values,W,n,new int[n+1][W+1]));
        System.out.println(maxProfitTab(weights,values,W));
    }
}