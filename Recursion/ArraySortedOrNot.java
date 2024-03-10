package Recursion;

class ArraySortedOrNot{
    public static boolean isSorted(int arr[],int pos){
        if(pos+1==arr.length)
        return true;
        
        if(arr[pos]>arr[pos+1])
        return false;
        
        return isSorted(arr,pos+1);
    }
    
    public static void main(){
        int arr[]={1,2,3,4,5,11,6,10};
        
        System.out.println(isSorted(arr,0));
    }
}