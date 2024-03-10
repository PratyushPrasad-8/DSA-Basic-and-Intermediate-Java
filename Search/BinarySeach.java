package Search;

public class BinarySeach{
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start-((start-end)/2);
            
            if(arr[mid]==key)
            return mid+1;
            else if(arr[mid]>key)
            end=mid-1;
            else
            start=mid+1;
        }
        
        return -1;
    }
    public static void main(){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=6;
        
        int index=binarySearch(arr,key);
        
        if(index==-1)
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION = "+index);
    }
}