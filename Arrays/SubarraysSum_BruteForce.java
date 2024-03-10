package Arrays;

public class SubarraysSum_BruteForce{
    public static void getSubArrays(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum+=arr[k];
                    
                    if(sum>max) max=sum;
                    if(sum<min) min=sum;
                }
                
                System.out.print("]----->"+sum+"   ");
            }
            System.out.println();
        }
        
        System.out.println("MAXIMUM SUM = "+max+" AND MINIMUM SUM = "+min);
    }
    public static void main(){
        int arr[]={2,4,6,8,10};
        
        getSubArrays(arr);
    }
}