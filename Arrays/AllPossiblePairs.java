package Arrays;

public class AllPossiblePairs{
    public static void getPairs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            System.out.println("("+arr[i]+","+arr[j]+") ");
        }
        System.out.println();
    }
    public static void main(){
        int arr[]={23,32,2,5,6,22,1,88};
        
        getPairs(arr);
    }
}