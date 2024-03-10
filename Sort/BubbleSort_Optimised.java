package Sort;

public class BubbleSort_Optimised{
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    swap++;
                }
            }
            if(swap==0)
            break;
        }
        
        print(arr);
    }
    
    public static void print(int arr[]){
        for(Integer i: arr){
            System.out.println(i);
        }
    }
    
    public static void main(){
        int arr[]={4,2,5,3,1};
        sort(arr);
    }
}