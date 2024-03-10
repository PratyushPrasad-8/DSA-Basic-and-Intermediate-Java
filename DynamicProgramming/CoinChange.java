package DynamicProgramming;

public class CoinChange{
    public static int totWaysMem(int coins[],int sum,int n,int dp[][]){
        if(sum==0){
            return 1;
        }
        
        if(n==0){
            return 0;
        }
        
        if(dp[n][sum]!=0){
            return dp[n][sum];
        }
        
        int val=coins[n-1];
        if(val<=sum){
            int w1=totWaysMem(coins,sum-val,n,dp);
            int w2=totWaysMem(coins,sum,n-1,dp);
            return dp[n][sum]=w1+w2;
        }else{
            return dp[n][sum]=totWaysMem(coins,sum,n-1,dp);
        }
    }
    
    public static int totWaysTab(int coins[],int sum){
        int n=coins.length;
        int dp[][]=new int[n+1][sum+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int val=coins[i-1];
                if(val<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-val];    
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
    }
    
    public static void main(){
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        int sum=5;
        int n=coins.length;
        
        System.out.println(totWaysMem(coins,sum,n,new int[n+1][sum+1]));
        System.out.println(totWaysTab(coins,sum));
    }
}