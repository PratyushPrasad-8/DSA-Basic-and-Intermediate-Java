package Sort;

public class CountSort{
    public static void sort(int arr[]){
        int n=arr.length,max=0;        
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        
        int count[]=new int[max+1];
        
        for(int i=0;i<n;i++)
        count[arr[i]]++;
        
        int k=0;
        for(int i=0;i<=max;i++){
            while(count[i]>0){
                arr[k]=i;
                k++;
                count[i]--;
            }
        }
        
        print(arr);
    }
    
    public static void print(int arr[]){
        for(Integer i : arr){
            System.out.println(i);
        }
    }
    
    public static void main(){
        int arr[]={4,5,1,3,2};
        
        sort(arr);
    }
}