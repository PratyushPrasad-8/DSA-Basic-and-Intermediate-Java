package Heap;

public class MinimumEffortPath{
    public static int ans=Integer.MAX_VALUE;
    public static void findMinimumCost(int arr[][],int row,int col,int currentAns){
        if(row==arr.length-1 && col==arr[0].length-1){
            currentAns+=arr[row][col];
            ans=Math.min(ans,currentAns);

            return;
        }
        
        if(row<0 || row>=arr.length || col<0 || col>=arr[0].length || arr[row][col]==-1){
            return;
        }
        
        int data=arr[row][col];
        currentAns+=data;
        arr[row][col]=-1;
        
        findMinimumCost(arr,row-1,col,currentAns);
        findMinimumCost(arr,row,col+1,currentAns);
        findMinimumCost(arr,row+1,col,currentAns);
        findMinimumCost(arr,row,col-1,currentAns);
        
        arr[row][col]=data;
    }
    
    public static void main(){
         int arr[][]={{ 31, 100, 65, 12, 18 },
                      { 10, 13, 47, 157, 6 },
                      { 100, 113, 174, 11, 33 },
                      { 88, 124, 41, 20, 140 },
                      { 99, 32, 111, 41, 20 }};
                      
         findMinimumCost(arr,0,0,0);
         System.out.print(ans);
    }
}