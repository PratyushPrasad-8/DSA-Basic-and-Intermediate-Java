package BitManupulation;

public class Add1UsingBits{
    public static int add(int n){
        return (-(~n));
    }
    
    public static void main(){
        int n=5;
        System.out.println("AFTER ADDING 1 TO "+n+" ANSWER IS : "+add(n));
    }
}