package Stacks;
import java.util.Stack;

public class DublicateParanthesis{
    public static boolean isDublicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr!=')'){
                s.push(curr);
            }else{
                if(s.peek()=='(')
                return true;
                else{
                    while(s.pop()!='(');
                }
            }
        }
        
        return false;
    }
    public static void main(){
        String str="((a+b)+((c+d)))";
        
        System.out.println(isDublicate(str));
    }
}