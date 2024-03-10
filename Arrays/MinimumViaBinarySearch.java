package Arrays;

public class MinimumViaBinarySearch{
    public static int minimum(int arr[]){
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(mid>0 && arr[mid-1]>arr[mid])
            return mid;
            else if(arr[left]<=arr[mid] && arr[right]<arr[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        
        return left;
    }
    public static void main(){
        int arr[]={5,6,7,8,1,2,3,4};
        
        System.out.println(minimum(arr));
    }
}