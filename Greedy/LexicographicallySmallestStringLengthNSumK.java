package Greedy;
public class LexicographicallySmallestStringLengthNSumK{
    public static void main(){
        int N=3;
        int K=25;
        String ans="";
        for(int i=26;i>0 && N>0;i--){
            while(K >= i && K-i>=N-1){
                char temp=(char)(i+97-1);
                ans=temp+ans;
                K-=i;
                N--;
            }
        }
        
        System.out.println(ans);
    }
}