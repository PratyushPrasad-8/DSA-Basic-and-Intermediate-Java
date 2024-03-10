package DynamicProgramming;

public class CatalansNumber{
    public static int findCatalan(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int cn=0;
        for(int i=n-1;i>=0;i--){
            cn+=findCatalan(n-i-1)*findCatalan(i);
        }
        return cn;
    }
    
    public static int findCatalanMem(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        int cn=0;
        for(int i=n-1;i>=0;i--){
            cn+=findCatalan(n-i-1)*findCatalan(i);
        }
        return dp[n]=cn;
    }
    
    public static int findCatalanTab(int n){
        int dp[]=new int[n+1];
        
        dp[0]=dp[1]=1;
        
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];    
            }
        }
        
        return dp[n];
    }
    
    public static void main(){
        int n=5;
        
        System.out.println(findCatalan(n));
        System.out.println(findCatalanMem(n,new int[n+1]));
        System.out.println(findCatalanTab(n));
    }
}