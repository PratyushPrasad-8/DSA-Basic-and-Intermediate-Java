package Recursion;

class Tiling{
    public static int allPossibleWays(int n){
        if(n==0 || n==1)
        return 1;
        
        return allPossibleWays(n-1)+allPossibleWays(n-2);
    }
    
    public static void main(){
        int n=10;
        
        System.out.println(allPossibleWays(n));
    }
}