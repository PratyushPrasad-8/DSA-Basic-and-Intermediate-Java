package DynamicProgramming;

public class StringConversion{
    public static int LCSmem(String s1,String s2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+LCSmem(s1,s2,n-1,m-1,dp);
        }else{
            return dp[n][m]=Math.max(LCSmem(s1,s2,n,m-1,dp),LCSmem(s1,s2,n-1,m,dp));
        }
    }
    
    public static int LCStab(String s1,String s2){
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
        String s1="pear";
        String s2="sea";
        int n=s1.length();
        int m=s2.length();
        
        //int com=LCSmem(s1,s2,n,m,new int[n][m]);
        int com=LCStab(s1,s2);
        
        int deletes=n-com;
        int insert=m-com;
        int noOfOperations=deletes+insert;
        
        System.out.println(deletes+"......."+insert+"........"+noOfOperations);
    }
}