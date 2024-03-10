package DynamicProgramming;
import java.util.ArrayList;

public class LongestIncreasingPath{
    public static ArrayList<Integer> longestPath(int arr[][],int row,int col,ArrayList<Integer> dp[][]){        
        if(dp[row][col].size()!=0){
            return dp[row][col];    
        }
        
        ArrayList<Integer> down=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        if(row+1<arr.length && arr[row+1][col]>arr[row][col]){
            down=longestPath(arr,row+1,col,dp);
        }
        
        if(col+1<arr[0].length && arr[row][col+1]>arr[row][col]){
            right=longestPath(arr,row,col+1,dp);
        }
        
        if(down.size()>right.size()){
            down.add(0,arr[row][col]);
            return dp[row][col]=down;
        }else{
            right.add(0,arr[row][col]);
            return dp[row][col]=right;
        }
    }
    
    public static void mian(){
        int m=4;
        int n=4;
        int arr[][]= {{ 1, 2, 3, 4 },
                      { 2, 2, 3, 4 },
                      { 3, 2, 3, 4 },
                      { 4, 5, 6, 7 }};
                      
        ArrayList dp[][]=new ArrayList[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=new ArrayList<>();
            }
        }
        
        ArrayList<Integer> al=longestPath(arr,0,0,dp);
        System.out.println(al.size()+"  "+al);
    }
}