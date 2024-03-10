package Arrays;

public class StairCaseSearch{
    static int r;
    static int c;
    
    public static boolean search(int arr[][],int target){
        int row=0;
        int col=arr[0].length-1;
        
        while(row<=arr.length-1 && col>=0){
            if(arr[row][col]== target){
                r=row;
                c=col;
                return true;
            }
            
            
            if(arr[row][col]>target)
            col--;
            else
            row++;
        }
        
        return false;
    }
    
    public static void main(){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    
        if(!search(arr,33))
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION : ("+r+" ,"+c+")");        
    }
}