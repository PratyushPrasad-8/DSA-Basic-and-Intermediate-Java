package Graphs;
import java.util.Queue;
import java.util.LinkedList;

public class RotAllOranges{
    public static class Bundle{
        int row;
        int col;
        int time;
        
        Bundle(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    
    public static int finalAns=0;
    
    public static int minTime(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int fresh=0;
        
        Queue<Bundle> q=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    fresh++;
                }
                
                if(arr[i][j]==2){
                    q.add(new Bundle(i,j,0));
                }
            }
        }
        
        while(!q.isEmpty()){
            Bundle curr=q.remove();
            int row=curr.row;
            int col=curr.col;
            int time=curr.time;
            finalAns=Math.max(finalAns,time);
            
            //up
            if(row-1>=0){
                if(arr[row-1][col]==1){
                    arr[row-1][col]=2;
                    q.add(new Bundle(row-1,col,time+1));
                    fresh--;
                }
            }
            //down
            if(row+1<arr.length){
                if(arr[row+1][col]==1){
                    arr[row+1][col]=2;
                    q.add(new Bundle(row+1,col,time+1));
                    fresh--;
                }
            }
            //left
            if(col-1>=0){
                if(arr[row][col-1]==1){
                    arr[row][col-1]=2;
                    q.add(new Bundle(row,col-1,time+1));
                    fresh--;
                }
            }
            //right
            if(col+1<arr[0].length){
                if(arr[row][col+1]==1){
                    arr[row][col+1]=2;
                    q.add(new Bundle(row,col+1,time+1));
                    fresh--;
                }
            }
        }
        
        if(fresh!=0){
            return -1;
        }else{
            return finalAns;
        }
    }
    
    public static void main(){
        int arr[][] = { {2, 1, 0, 2, 1},
                      {0, 0, 1, 2, 1},
                      {1, 1, 1, 2, 1}};
        
        System.out.println(minTime(arr));
    }
}