package DynamicProgramming;

public class LongestCommonSubstring{
    static int ans=0;
    public static int lcssMem(String s1,String s2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            int currAns = 1+lcssMem(s1,s2,n-1,m-1,dp);
            ans=Math.max(ans,currAns);
            return dp[n][m]=currAns;
        }else{
            lcssMem(s1,s2,n,m-1,dp);
            lcssMem(s1,s2,n-1,m,dp);
            return 0;
        }
    }
    
    public static int lcssTab(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        
        int dp[][]=new int[n+1][m+1];
        
        int finalAns=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    finalAns=Math.max(finalAns,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        
        return finalAns;
    }
    
    public static void main(){
        String s1="abcde";
        String s2="abgce";
        
        lcssMem(s1,s2,s1.length(),s2.length(),new int[s1.length()+1][s2.length()+1]);
        System.out.println(ans);
        System.out.println(lcssTab(s1,s2));
    }
}