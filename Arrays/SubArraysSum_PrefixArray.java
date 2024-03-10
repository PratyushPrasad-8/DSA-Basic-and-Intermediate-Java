package Arrays;

public class SubArraysSum_PrefixArray{
    public static void getSubArrays(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        int prefixArray[]=new int[arr.length];
        prefixArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i-1];
            prefixArray[i]=sum+arr[i];
        }
        
        sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=(i==0)?prefixArray[j]:(prefixArray[j]-prefixArray[i-1]);
                if(sum>max) max=sum;
                if(sum<min) min=sum;
            }
        }
        
        System.out.println("MAXIMUM SUM = "+max+" AND MINIMUM SUM = "+min);
    }
    public static void main(){
        int arr[]={2,4,6,8,10};
        
        getSubArrays(arr);
    }
}