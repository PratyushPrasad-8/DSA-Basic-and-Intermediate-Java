package BackTracking;

public class RatMaze{
    public static void solve(int maze[][],int i,int j,int er,int ec){
        if(i==er-1 && j==ec-1){
            maze[i][j]=2;
            print(maze);
            maze[i][j]=1;
            return;
        }
        
        if(i==-1 || i==er || j==-1 || j==ec)
        return;
        
        if(maze[i][j]==0 || maze[i][j]==2)
        return;
        
        maze[i][j]=2;
        solve(maze,i,j+1,er,ec);//right
        solve(maze,i+1,j,er,ec);//down
        solve(maze,i,j-1,er,ec);//left
        solve(maze,i-1,j,er,ec);//up
        maze[i][j]=1;
    }
    
    public static void print(int maze[][]){
        System.out.println("-----------------WAYS---------------------");
        int n =maze.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(maze[i][j]==2)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
    
    public static void main(){
        int maze[][]={
            {1,1,1,1},
            {0,1,0,1},
            {1,1,1,1},
            {1,0,1,1}};
        
        int n=maze.length; 
        solve(maze,0,0,n,n);
        
    }
}