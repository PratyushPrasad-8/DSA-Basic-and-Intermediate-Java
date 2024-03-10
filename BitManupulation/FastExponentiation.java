package BitManupulation;

public class FastExponentiation{
    public static int power(int m,int n){
        int ans=1;
        while(n!=0){
            if((n&1)!=0){
                ans*=m;
            }
            m=m*m;
            n=n>>1;
        }
        return ans;
    }
    public static void main(){
        System.out.println(power(1000005,3));
    }
}