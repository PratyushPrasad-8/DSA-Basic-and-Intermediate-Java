package Graphs;
import java.util.Queue;
import java.util.LinkedList;

public class FloodFill{
    public static class Pair{
        int row;
        int col;
        
        Pair(int r,int c){
            row=r;
            col=c;
        }
    }
    public static void dfs(int arr[][],int cr,int cc,int newColor,int colorToChange){
        if(cr>=arr.length || cc>=arr.length || cr<0 || cc<0 || arr[cr][cc]!=colorToChange){
            return ;
        }
        
        arr[cr][cc]=newColor;
        dfs(arr,cr+1,cc,newColor,colorToChange);
        dfs(arr,cr-1,cc,newColor,colorToChange);
        dfs(arr,cr,cc+1,newColor,colorToChange);
        dfs(arr,cr,cc-1,newColor,colorToChange);
    }
    
    public static void bfs(int arr[][],int sr,int sc,int newColor,int colorToChange){
        boolean vis[]=new boolean[arr.length];
        Queue<Pair> q=new LinkedList<>();
        
        q.add(new Pair(sr,sc));
        arr[sr][sc]=newColor;
        
        while(!q.isEmpty()){
            Pair curr=q.remove();
            int row=curr.row;
            int col=curr.col;
            
            if(row+1<arr.length && arr[row+1][col]==colorToChange){
                q.add(new Pair(row+1,col));
                arr[row+1][col]=newColor;
            }
            
            if(row-1>=0 && arr[row-1][col]==colorToChange){
                q.add(new Pair(row-1,col));
                arr[row-1][col]=newColor;
            }
            
            if(col+1<arr.length && arr[row][col+1]==colorToChange){
                q.add(new Pair(row,col+1));
                arr[row][col+1]=newColor;
            }
            
            if(col-1>=0 && arr[row][col-1]==colorToChange){
                q.add(new Pair(row,col-1));
                arr[row][col-1]=newColor;
            }
        }
    }
    
    public static void main(){
        int arr[][]={{1,1,1},
                     {1,1,0},
                     {1,0,1}};
        int sr=1;
        int sc=1;             
        int newColor=2;
        int colorToChange=arr[sr][sc];
        //dfs(arr,sr,sc,newColor,colorToChange);
        bfs(arr,sr,sc,newColor,colorToChange);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}