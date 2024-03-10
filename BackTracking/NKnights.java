package BackTracking;


public class NKnights{
    public static void allPossibleWays(int board[][],int i,int j,int count){
        if(i<0 || j<0 || i>=board.length || j>=board.length || board[i][j]!=0)
        return ;
        
        if(count==(board.length*board.length-1)){
            board[i][j]=count;
            print(board);
            board[i][j]=0;
            //return;
            System.exit(0);
        }
        
        
        board[i][j]=count;
        
        allPossibleWays(board,i+2,j+1,count+1);
        allPossibleWays(board,i+1,j+2,count+1);
        allPossibleWays(board,i-1,j+2,count+1);
        allPossibleWays(board,i-2,j+1,count+1);
        allPossibleWays(board,i-2,j-1,count+1);
        allPossibleWays(board,i-1,j-2,count+1);
        allPossibleWays(board,i+1,j-2,count+1);
        allPossibleWays(board,i+2,j-1,count+1);
        
        board[i][j]=0;
    }
    
    public static void print(int board[][]){
        System.out.println("--------------------------------------WAYS---------------------------------------------");
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]>9)
                System.out.print(board[i][j]+" ");
                else
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main(){
        int n=8;
        int board[][]=new int[n][n];
        allPossibleWays(board,0,0,0);
    }
}