package Greedy;
import java.util.Arrays;

public class MinimumAbsoluteDifference{
    public static void main(){
        int a[]={1,2,3};
        int b[]={2,1,3};
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans+=Math.abs(a[i]-b[i]);
        }
        
        System.out.println(ans);
    }
}