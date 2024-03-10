package DynamicProgramming;

public class Fibonacci{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return fib(n-1)+fib(n-2);
    }
    
    public static int fibMem(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        return dp[n]=fibMem(n-1,dp)+fibMem(n-2,dp);
    }
    
    public static int fibTab(int n){
        int dp[]=new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
    
    public static void main(){
        int n=5;
        System.out.println(fib(n));
        
        System.out.println(fibMem(n,new int[n+1]));
        
        System.out.println(fibTab(n));
    }
}