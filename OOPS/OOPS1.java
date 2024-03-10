package OOPS;

class OOPS1{
    public static void main(){
        Pen ob1=new Pen();
        Pen ob2=new Pen();
        
        ob1.color="RED";
        ob1.tip=2;
        ob2.color="BLUE";
        ob2.tip=3;
        ob1.color="PINK";
        
        System.out.println(ob1.color);
        System.out.println(ob2.color);
        System.out.println(ob2.color+"*");
        
        ob2.write();
        ob1.scribe();
    }
}