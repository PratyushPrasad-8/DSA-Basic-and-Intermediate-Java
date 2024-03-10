package OOPS;

class Pencil extends Pen{
    String eraser;
    
    void draw(){
        System.out.println("DRAWING");
    }
    
    void write(int x){
        System.out.println("WRITING WITH PENCIL");
    }
    
    void sharp(){
        System.out.println("SHARPEN");
    }
}