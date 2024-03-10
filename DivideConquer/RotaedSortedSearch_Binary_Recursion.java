package DivideConquer;

class RotaedSortedSearch_Binary_Recursion{
    public static int binarySearch(int arr[],int si,int ei,int key){
        if(si>ei)
        return -1;
        
        int mid=si+((ei-si)/2);
        if(arr[mid]==key)
        return mid;
        
        if(arr[si]<=arr[mid]){
            if(arr[si]<=key && key <=arr[mid])
            return binarySearch(arr,si,mid-1,key);
            else
            return binarySearch(arr,mid+1,ei,key);
        }else{
            if(arr[mid]<=key && key<=arr[ei])
            return binarySearch(arr,mid+1,ei,key);
            else
            return binarySearch(arr,si,mid-1,key);
        }
    }
    
    public static void main(){
        int arr[]={6,7,8,9,1,2,3,4,5};
        int key=3;
        
        System.out.println(binarySearch(arr,0,arr.length-1,key));
    }
}