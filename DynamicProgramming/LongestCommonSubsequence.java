package DynamicProgramming;

public class LongestCommonSubsequence{
    public static int lcs(String s1,String s2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return 1+lcs(s1,s2,n-1,m-1);
        }else{
            return Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
        }
    }
    
    public static int lcsMem(String s1,String s2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+lcsMem(s1,s2,n-1,m-1,dp);
        }else{
            return dp[n][m]=Math.max(lcsMem(s1,s2,n-1,m,dp),lcsMem(s1,s2,n,m-1,dp));
        }
    }
    
    public static int lcsTab(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        
        int dp[][]=new int [n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
    }
    
    public static void main(){
        String s1="abcde";
        String s2="acgfhk";
        
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
        System.out.println(lcsMem(s1,s2,s1.length(),s2.length(),new int[s1.length()+1][s2.length()+1]));
        System.out.println(lcsTab(s1,s2));
    }
}