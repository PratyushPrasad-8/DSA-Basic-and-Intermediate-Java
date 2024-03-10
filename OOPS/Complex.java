package OOPS;

public class Complex{
    void sum(int a,int b,int c,int d){
        int sum1=a+c;
        int sum2=b+d;
        System.out.println("SUM OF "+a+"i"+b+" AND "+c+"i"+d+" = "+sum1+"i"+sum2);
    }
    
    void difference(int a,int b,int c,int d){
        int diff1=a-c;
        int diff2=b-d;
        System.out.println("DIFFERNCE OF "+a+"i"+b+" AND "+c+"i"+d+" = "+diff1+"i"+diff2);  
    }
    
    void product(int a,int b,int c,int d){
        int prod1=a*c;
        int prod2=b*d;
        System.out.println("PRODUCT OF "+a+"i"+b+" AND "+c+"i"+d+" = "+prod1+"i"+prod2);
    }
}