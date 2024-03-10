package Arrays;

public class NumberOfTargets{
    public static int number(int arr[][],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target)
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(){
        int arr[][]={{1,2,4},{4,4,5},{6,7,1}};
        
        System.out.print(number(arr,4));
    }
}