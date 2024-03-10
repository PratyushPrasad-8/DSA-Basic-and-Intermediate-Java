package BitManupulation;

public class BitsManipulation{
    public static void bitWiseAnd(int m,int n){
        System.out.println(m&n);
    }
    
    public static void bitWiseOr(int m,int n){
        System.out.println(m|n);
    }
    
    public static void bitWiseXor(int m,int n){
        System.out.println(m^n);
    }
    
    public static void bitWiseComplement(int m){
        System.out.println(~m);
    }
    
    public static void bitWiseLeft(int m,int n){
        System.out.println(m<<n);
    }
    
    public static void bitWiseRight(int m,int n){
        System.out.println(m>>n);
    }
    
    public static void main(){
        bitWiseAnd(5,6);
        bitWiseOr(5,-6);
        bitWiseXor(-5,-6);
        bitWiseComplement(5);
        bitWiseLeft(-5,2);
        bitWiseRight(-5,2);
        
        
    }
}