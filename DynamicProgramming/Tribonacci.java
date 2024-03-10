package DynamicProgramming;

public class Tribonacci{
    public static int tribonacciTab(int n){
        int dp[]=new int[n+1];
        
        dp[1]=0;
        dp[2]=0;
        dp[3]=1;
        
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        
        return dp[n];
    }
    
    public static void main(){
        int n=20;
        
        System.out.println(tribonacciTab(n));
    }
}