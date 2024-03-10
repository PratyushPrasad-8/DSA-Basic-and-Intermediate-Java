package Recursion;

class NthTermOfFibonacci{
    public static int fibo(int n){
        if(n==1 || n==0)
        return n;
        
        return fibo(n-1)+fibo(n-2);
    }
    
    public static void main(){
        int n=6;
        
        System.out.println(fibo(n));
    }
}