package Recursion;

class NTO1_1ToN{
    public static void printNTO1(int n){
        if(n==0)
        return;
        
        System.out.print(n+" ");
        printNTO1(n-1);
    }
    
    public static void print1ToN(int n){
        if(n==0)
        return;
        
        print1ToN(n-1);
        System.out.print(n);
    }
    
    public static void main(){
        int n=10;
        printNTO1(n);
        System.out.println();
        print1ToN(n);
    }
}