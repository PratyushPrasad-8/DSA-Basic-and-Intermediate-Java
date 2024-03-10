package Arrays;

public class Transpose_sameArray{
    public static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<10)
                System.out.print(arr[i][j]+"  ");
                else
                System.out.print(arr[i][j]+" ");
            }     
            System.out.println();
        }
    }
    public static void main(){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        transpose(arr);
    }
}