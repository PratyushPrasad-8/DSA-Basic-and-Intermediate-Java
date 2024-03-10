package Recursion;

class Factorial{
    public static int fact(int n){
        if(n==1 || n==2)
        return n;
        
        return n*fact(n-1);
    }
    public static void main(){
        int n=5;
        System.out.println(fact(5));
    }
}