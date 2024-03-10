package Recursion;

class SumOfNaturalNos{
    public static int sum(int n){
        if(n==0)
        return n;
        
        //return n+sum(n-1); 
        //      OR
        int s=sum(n-1);
        return s+n;
    }
    
    public static void main(){
        int n=100;
        System.out.println(sum(n));
    }
}