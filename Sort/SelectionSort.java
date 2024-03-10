package Sort;

public class SelectionSort{
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minPos])
                minPos=j;
            }
            
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
        
        print(arr);
    }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(){
        int arr[]={3,2,4,1,5};
        
        sort(arr);
    }
}