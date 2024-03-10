package Graphs;

public class LargestRegionBooleanMatrix{
    public static int finalAns=0;
    public static void dfs(int arr[][],int cr,int cc,boolean vis[][],int result){
        if(cr>=arr.length || cc>=arr[0].length || cr<0 || cc<0 || vis[cr][cc] || arr[cr][cc]==0){
            return;
        }
        
        vis[cr][cc]=true;

        result++;
        finalAns=Math.max(finalAns,result);
        
        dfs(arr,cr+1,cc,vis,result);
        dfs(arr,cr-1,cc,vis,result);
        dfs(arr,cr,cc+1,vis,result);
        dfs(arr,cr,cc-1,vis,result);
        dfs(arr,cr+1,cc+1,vis,result);
        dfs(arr,cr-1,cc-1,vis,result);
        dfs(arr,cr+1,cc-1,vis,result);
        dfs(arr,cr-1,cc+1,vis,result);
    }
    
    public static void main(){
        int arr[][]={{0,0,1,1,0},
                     {0,0,1,1,0},
                     {0,0,0,0,0},
                     {1,1,1,1,1}};
        boolean vis[][]=new boolean[arr.length][arr[0].length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(!vis[i][j] && arr[i][j]==1){
                    dfs(arr,i,j,vis,0);
                }
            }
        }
        
        System.out.println(finalAns);
    }
}