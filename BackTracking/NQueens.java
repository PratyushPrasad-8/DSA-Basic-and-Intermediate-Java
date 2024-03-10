package BackTracking;

public class NQueens{
    public static void nqueens(char board[][],int row){
        if(row==board.length){
            print(board);
            return;
        }

        
        for(int col=0;col<board[0].length;col++){
            if(!isSafe(board,row,col))
            continue;
            
            board[row][col]='Q';
            nqueens(board,row+1);
            board[row][col]='X';
        }
    }
    
    public static boolean isSafe(char board[][],int row,int col){
        //up
        int i=row,j=col;
        while(i>=0){
            if(board[i][col]=='Q')
            return false;
            
            i--;
        }
        
        //diagonal right up
        i=row;j=col;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q')
            return false;
            
            i--;j++;
        }
        
        //diagonal left up
        i=row;j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')
            return false;
            
            i--;j--;
        }
        
        return true;
    }
    
    public static void print(char board[][]){
        int n=board.length;
        System.out.println("\n______________________BOARD__________________");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(board[i][j]);
            System.out.println();
        }
    }
    
    public static void main(){
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            board[i][j]='X';
        }
        
        nqueens(board,0);
    }
}