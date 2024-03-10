package DivideConquer;

class RotatedSortedSearch_Binary_While{
    public static int binarySearch(int arr[],int key){
        int si=0;
        int ei=arr.length-1;
        while(si!=ei){
            int mid=si+(ei-si)/2;
            
            if(arr[mid]==key)
            return mid;
            
            if(arr[si]<=arr[mid]){
                if(arr[si]<=key && key<=arr[mid])
                ei=mid-1;
                else
                si=mid+1;
            }else{
                if(arr[mid]<=key && key<=arr[ei])
                si=mid+1;
                else
                ei=mid-1;
            }
        }
        
        if(arr[si]==key)
        return si;
        
        return -1;
    }
    
    public static void main(){
        int arr[]={6,7,8,9,1,2,3,4,5};
        int key=3;
        
        System.out.println(binarySearch(arr,key));
    }
}