package BitManupulation;

public class SwapWithoutThirdVariable{
    public static String swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        String s="AFTER SWAPPING : A = "+a+" B = "+b;
        return s;
    }
    
    public static void main(){
        int a=6;
        int b=7;
        System.out.println("WITHOUT SWAPPING : A = "+a+" B = "+b);
        System.out.println(swap(a,b));
    }
}