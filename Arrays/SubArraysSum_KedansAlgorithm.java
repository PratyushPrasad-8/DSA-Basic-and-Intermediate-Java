package Arrays;

public class SubArraysSum_KedansAlgorithm{
    public static void kedan(int arr[]){
        int max1,max2;
        max1=max2=Integer.MIN_VALUE;
        int cs=0;
        
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            
            if(cs<0)
            cs=0;
            
            if(cs>max1) max1=cs;
            if(arr[i]>max2) max2=arr[i];
        }
        
        if(max1!=0)
        System.out.println(max1);
        else
        System.out.println(max2);
    }
    public static void main(){
        int arr[]={-2,-3,-4,-1,-2,-1,-5,3,0};
        
        kedan(arr);
    }
}