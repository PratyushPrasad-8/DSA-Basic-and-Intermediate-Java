package DynamicProgramming;

public class Robber{
    public static int rob(int nums[],int idx){
        if(idx>=nums.length){
            return 0;
        }
        
        return Math.max(rob(nums,idx+1),nums[idx]+rob(nums,idx+2));
    }
    
    public static void main(){
        int nums[] = {2,7,9,3,1};
        
        System.out.println(rob(nums,0));
    }
}