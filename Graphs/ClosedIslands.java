package Graphs;

public class ClosedIslands{
    public static boolean isValidIsland(int cr,int cc,boolean vis[][],int arr[][]){
        if(cr>=arr.length || cc>=arr[0].length || cr<0 || cc<0){
            return false;
        }
        
        if(arr[cr][cc]==0 || (vis[cr][cc])){
            return true;
        }
        
        vis[cr][cc]=true;
        
        boolean top=isValidIsland(cr-1,cc,vis,arr);
        boolean bottom=isValidIsland(cr+1,cc,vis,arr);
        boolean left=isValidIsland(cr,cc-1,vis,arr);
        boolean right=isValidIsland(cr,cc+1,vis,arr);
        
        return (top && bottom && left && right);
    }
    
    public static void main(){
        int arr[][]={{1, 0, 0},{0, 1, 0},{0, 0, 1}};
        boolean vis[][]=new boolean[arr.length][arr[0].length];
        int islands=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(!vis[i][j] && arr[i][j]==1 ){
                    if(isValidIsland(i,j,vis,arr))
                    islands++;
                }
            }
        }
        
        System.out.println("NUMBER OF ISLANDS ARE : "+islands);
    }
}