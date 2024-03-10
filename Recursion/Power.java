package Recursion;

class Power{
    public static int pow(int x,int n){
        if(n==0)
        return 1;
        
        int temp=pow(x,n/2);
        temp*=temp;

        if((n & 1) == 1)
        return x*temp;
        else
        return temp;
    }
    public static void main(){
        int x=5;
        int n=3;
        
        System.out.println(pow(x,n));
    }
}