package BackTracking;

public class ArrayChange{
    public static void arrChange(int arr[],int pos,int val){
        if(pos==arr.length)
        return;
        
        arr[pos]=val;
        arrChange(arr,pos+1,val+1);
        arr[pos]-=2;
    }
    
    public static void print(int arr[]){
        for(Integer i:arr)
        System.out.print(i+" ");
    }
    
    public static void main(){
        int arr[]=new int [5];
        
        arrChange(arr,0,1);
        print(arr);
    }
}