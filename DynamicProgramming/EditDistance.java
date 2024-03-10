package DynamicProgramming;

public class EditDistance{
    public static int edMem(String s1,String s2,int n, int m,int dp[][]){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m]=edMem(s1,s2,n-1,m-1,dp);
        }else{
            return dp[n][m]=1+(Math.min(edMem(s1,s2,n,m-1,dp),Math.min(edMem(s1,s2,n-1,m,dp),edMem(s1,s2,n-1,m-1,dp))));
        }
    }
    
    public static int edTab(String s1,String s2,int dp[][]){
        int n=s1.length();
        int m=s2.length();
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(m-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        
        return dp[n][m];
    }
    
    public static void main(){
        String s1="intention";
        String s2="execution";
        int n=s1.length();
        int m=s2.length();
        
        int dp[][]=new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        
        System.out.println(edMem(s1,s2,s1.length(),s2.length(),dp));
        System.out.println(edTab(s1,s2,dp));
    }
}