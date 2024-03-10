package Sort;

public class InsertionSort{
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            
            arr[prev+1]=curr;
        }
        
        print(arr);
    }
    
    public static void print(int arr[]){
        for(Integer i : arr){
            System.out.println(i);
        }
    }
    
    public static void main(){
        int arr[]={2,5,4,3,1};
        
        sort(arr);
    }
}