package Recursion;

class FirstOccurance{
    public static int fO(int arr[],int key,int pos){
        if(pos==arr.length)
        return -1;
        
        if(arr[pos]==key)
        return pos+1;
        
        return fO(arr,key,pos+1);
    }
    
    public static void main(){
        int arr[] = {1,2,3,4,5,6,7,8,3};
        int key=3;
        
        int position=fO(arr,key,0);
        if(position==-1)
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION : "+position);
    }
}