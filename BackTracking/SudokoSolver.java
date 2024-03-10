package BackTracking;

public class SudokoSolver{
    public static boolean solve(int sudoku[][],int row,int col){
        if(row==9){
            return true;
        }
        
        int nextRow,nextCol;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        else{
            nextRow=row;
            nextCol=col+1;
        }
        
        if(sudoku[row][col]!=0)
        return solve(sudoku,nextRow,nextCol);
        
        for(int digit=0;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(solve(sudoku,nextRow,nextCol))
                return true;
                
                //sudoku[row][col]=0;
            }
        }
        return false;
    }
    
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //row
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit)
            return false;
        }
        
        //column
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit)
            return false;
        }
        
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit)
                return false;
            }
        }
        
        return true;
    }
    
    public static void print(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]);
                if(j%3==2)
                System.out.print(" ");
            }
            System.out.println();
            if(i%3==2)
            System.out.println();
        }
    }
    
    public static void main(){
        int sudoku[][]=
        {
        {0,5,0,8,0,0,0,4,1},
        {8,6,0,5,4,0,0,2,3},
        {0,1,0,0,3,6,5,0,8},
        {4,3,0,0,8,7,9,0,0},
        {1,2,0,9,5,4,0,8,7},
        {0,0,7,1,2,0,0,5,6},
        {2,0,3,7,1,0,0,6,0},
        {5,7,0,0,6,8,0,3,9},
        {6,4,0,0,0,2,0,7,0}
        };
        
        if(solve(sudoku,0,0))
        print(sudoku);
        else
        System.out.println("CANNOT BE SOLVED");
    }
    
}