package DynamicProgramming;

public class Kedans{
    public static void main(){
        int arr[]={1,2,-4,-8,5};
        
        int ans=0,finalAns=0;
        for(int i=0;i<arr.length;i++){
            if(ans+arr[i]>0){
                ans+=arr[i];
                finalAns=Math.max(finalAns,ans);
            }else{
                ans=0;
            }
        }
        
        System.out.println(finalAns);
    }
}