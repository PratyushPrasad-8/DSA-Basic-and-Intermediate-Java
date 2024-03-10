package Recursion;

class AllOccurance{
    public static void aO(int arr[],int key,int pos){
        if(pos==arr.length)
        return ;
        
        if(arr[pos]==key)
        System.out.print(pos+" ");
        
        aO(arr,key,pos+1);
    }
    
    public static void main(){
        int arr[] = {1,2,3,4,5,3,6,7,8,3};
        int key=3;
        
        aO(arr,key,0);
    }
}