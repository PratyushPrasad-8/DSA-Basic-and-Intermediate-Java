package Recursion;

class LastOccurance{
    public static int lO(int arr[],int key,int pos){
        if(pos==arr.length)
        return -1;
        
        int temp=lO(arr,key,pos+1);
        if(arr[pos]==key && temp==-1)
        return pos+1;
        
        return temp;
    }
    
    public static void main(){
        int arr[] = {1,2,3,4,5,3,6,7,8};
        int key=3;
        
        int position=lO(arr,key,0);
        if(position==-1)
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION : "+position);
    }
}