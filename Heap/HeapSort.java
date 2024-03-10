package Heap;

public class HeapSort{
    public static void heapify(int i,int n,int arr[]){
        int left=2*i+1;
        int right=2*i+2;
        int min=i;
        
        if(left>=n || right>=n){
            return;
        }
        
        min=(arr[left]>arr[min])?left:min;
        min=(arr[right]>arr[min])?right:min;
        
        if(i!=min){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            
            heapify(min,n,arr);
        }
    }
    
    public static void heapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(i,n,arr);
        }
        
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(0,i,arr);
        }
    }
    
    public static void main(){
        int arr[]={-4,3,-8,11,103,2,6};
        
        heapSort(arr);
        
        for(Integer i: arr){
            System.out.print(i+" ");
        }
    }
}