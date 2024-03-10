package BitManupulation;

public class PowerOf2{
    public static boolean check(int n){
        if((n&(n-1))==0)
        return true;
        else
        return false;
    }
    
    public static void main(){
        System.out.println(check(6));
    }
}