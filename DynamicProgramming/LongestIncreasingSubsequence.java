package DynamicProgramming;
import java.util.TreeSet;

public class LongestIncreasingSubsequence{
    public static int LisMem(int arr[],int n,int last){
        if(n==0){
            return 0;
        }
        
        if(arr[n-1]<=last){
            int a1=1+LisMem(arr,n-1,arr[n-1]);
            int a2=LisMem(arr,n-1,last);
            
            return Math.max(a1,a2);
        }else{
            return LisMem(arr,n-1,last);
        }
    }
    
    public static int LisTab(int arr[]){
        int n=arr.length;
        TreeSet<Integer> ts=new TreeSet<>();
        
        for(int i=0;i<n;i++){
            ts.add(arr[i]);
        }
        
        int m=ts.size();
        int copy[]=new int[m];
        int k=0;
        for(Integer i : ts){
            copy[k]=i;
            k++;
        }
        
        int dp[][]=new int[n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr[i-1]==copy[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
    }
    
    public static void main(){
        int arr[]={50,3,10,7,40,80};
        int n=arr.length;
        
        System.out.println(LisMem(arr,n,Integer.MAX_VALUE));
        System.out.println(LisTab(arr));
    }
}