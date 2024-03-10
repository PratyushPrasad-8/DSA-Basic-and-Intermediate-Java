package BitManupulation;

public class OddEven_Bits{
    public static String oddEven(int n){
        if((n & 1) == 0)
        return "EVEN";
        else
        return "ODD";
    }
    public static void main(){
        System.out.println(oddEven(8));
    }
}