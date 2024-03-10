package Search;

public class LinearSearch{
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i+1;
        }
        
        return -1;
    }
    public static void main(){
        int arr[]={23,54,63,22,98,99,876,66};
        int key=100;
        int index=linearSearch(arr,key);
        if(index==-1)
        System.out.println("NUMBER NOT FOUND");
        else
        System.out.println("NUMBER FOUND IN POSITION = "+index);
    }    
}