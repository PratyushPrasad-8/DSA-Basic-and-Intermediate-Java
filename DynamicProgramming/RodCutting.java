package DynamicProgramming;

public class RodCutting{
    public static int maxProfitMem(int price[],int length,int n,int dp[][]){
        if(length==0 || n==0){
            return 0;
        }
        
        if(dp[n][length]!=0){
            return dp[n][length];
        }
        
        int len=n;
        if(len<=length){
            int ans1=price[n-1]+maxProfitMem(price,length-len,n,dp);
            int ans2=maxProfitMem(price,length,n-1,dp);
            return dp[n][length]=Math.max(ans1,ans2);
        }else{
            return dp[n][length]=maxProfitMem(price,length,n-1,dp);
        }
    }
    
    public static int maxProfitTab(int price[],int length){
        int n=price.length;
        int dp[][]=new int[n+1][length+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<length+1;j++){
                int len=i;
                int val=price[i-1];
                if(len<=j){
                    dp[i][j]=Math.max(val+dp[i][j-len],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][length];
    }
    
    public static void main(){
        int price[]={1,5,8,9,10,17,17,20};
        int length=8;
        
        int n=price.length;
        
        System.out.println(maxProfitMem(price,length,n,new int[n+1][n+1]));
        System.out.println(maxProfitTab(price,length));
    }
}