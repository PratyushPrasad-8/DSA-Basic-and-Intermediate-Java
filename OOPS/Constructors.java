package OOPS;

class Constructors{
    int a=0;
    Constructors(){
       this(5); 
       this.a=5;
       System.out.println("CALLED PARAMETERIZED"); 
    }
    
    Constructors(int x){
        System.out.println("SUCCESS"+x);
    }
    
    Constructors(Constructors ob){
        this.a=ob.a;
        System.out.println("CALLED COPY CONSTRUCTOR");
    }
    
    void print(){
        System.out.println(a);
    }
}