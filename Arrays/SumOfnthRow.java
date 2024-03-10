package Arrays;

public class SumOfnthRow{

    public static int sum(int arr[][],int row){
        if(row>=arr.length || row<0)
        return -1;
        
        int sum=0;
        for(int j=0;j<arr[0].length;j++)
        sum+=arr[row][j];
        
        return sum;
    }
        
    public static void main(){
        int arr[][]={{1,2,4},{4,4,5},{6,7,1}};
        
        int sums=sum(arr,1);
        if(sums==-1)
        System.out.print("WRONG INPUT");
        else
        System.out.print("SUM = "+sums);
    }
}