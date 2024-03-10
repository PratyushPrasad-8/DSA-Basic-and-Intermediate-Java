package BackTracking;

public class GridWays{
    public static void ways(char grid[][],int i,int j,int er,int ec){
        if(i==er-1 && j==ec-1){
            grid[i][j]='*';
            print(grid);
            return;
        }
        
        if(i==er || j==ec)
        return ;
        
        grid[i][j]='*';
        ways(grid,i,j+1,er,ec);
        ways(grid,i+1,j,er,ec);
        grid[i][j]='0';
    }
    
    public static void print(char grid[][]){
        System.out.println("----------------NEW GRID-------------");
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(grid[i][j]);
            System.out.println();
        }        
    }
    
    public static void main(){
        int n=3;
        char grid[][]=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            grid[i][j]='0';
        }
        
        ways(grid,0,0,n,n);
    }
}