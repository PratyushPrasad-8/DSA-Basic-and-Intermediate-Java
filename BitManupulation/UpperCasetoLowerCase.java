package BitManupulation;

public class UpperCasetoLowerCase{
    public static char convert(char a){
        int bitMask=(1<<5);
        int b=a;
        b=(b|bitMask);
        
        return ((char)b);
    }
    
    public static void main(){
        char a='G';
        System.out.println(((char)(1<<5))+"HELLO");
        System.out.println("AFTER "+a+" IS CONVERTED TO LOWERCASE: "+convert(a));
    }
}