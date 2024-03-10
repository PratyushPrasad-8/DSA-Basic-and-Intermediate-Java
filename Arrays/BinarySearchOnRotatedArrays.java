package Arrays;

public class BinarySearchOnRotatedArrays{
    public static int binarySearch(int arr[],int target){
        int min=minSearch(arr);
        
        if(target>=arr[min] && target<=arr[arr.length-1])
        return(search(arr,min,arr.length-1,target));
        if(target>=arr[min] && target>=arr[0])
        return(search(arr,0,min,target));
        
        return -1;
    }
    
    public static int minSearch(int arr[]){
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid>0 && arr[mid-1]>arr[mid])
            return mid;
            else if(arr[left]<=arr[mid] && arr[right]<= arr[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        
        return left;
    }
    
    public static int search(int arr[],int left,int right,int target){
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        
        return -1;
    }
    
    public static void main(){
        int arr[]={4,  5, 6, 7, 0, 1, 2};
        int target=3;
        
        int index=binarySearch(arr,target);
        if(index==-1)
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION : "+index);
    }
}