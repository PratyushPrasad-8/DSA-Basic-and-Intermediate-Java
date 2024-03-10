package Arrays;

public class SpiralMatrix{
    public static void spiral(int arr[][]){
        int sr=0,sc=0,er=arr.length-1,ec=arr[0].length-1;
        
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++)
            System.out.print(arr[sr][j]);
            sr++;
            
            //right
            for(int i=sr;i<=er;i++)
            System.out.print(arr[i][ec]);
            ec--;
            
            //bottom
            for(int j=ec;j>=sc;j--)
            System.out.print(arr[er][j]);
            er--;
            
            //left
            for(int i=er;i>=sr;i--)
            System.out.print(arr[i][sc]);
            sc++;
        }
        System.out.println();
    }
    public static void main(){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int ar[][]={{1,2,3},{4,5,6}};
        spiral(arr);
        spiral(ar);
    }
}