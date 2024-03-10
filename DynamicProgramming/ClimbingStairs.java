package DynamicProgramming;

public class ClimbingStairs{
    public static int waysMem(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        return dp[n]=waysMem(n-1,dp)+waysMem(n-2,dp);
    }
    
    public static int waysTab(int n){
        int dp[]=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
    
    public static void main(){
        int n=4;
        System.out.println(waysMem(n,new int[n+1]));
        
        System.out.println(waysTab(n));
    }
}