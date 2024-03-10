package Greedy;
class KthLargestOddNumberInGivenRange{
    public static void main(){
        int L=-3;
        int R=3;
        int K=4;
        
        for(int i=R;i>=L;i--){
            if(Math.abs(i%2)==1){
                if(K>1){
                    K--;
                }else{
                    System.out.println(i);
                    break;
                }
            }
        }
        
        if(K>1)
        System.out.println(0);
    }
}