package Stacks;
import java.util.Stack;
public class ValidParanthesis{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            
            if(curr=='(' || curr=='{' || curr=='['){
                s.push(curr);
            }else{
                if(s.isEmpty())
                return false;
                
                if(s.peek()=='(' && curr==')' ||
                   s.peek()=='{' && curr=='}' ||
                   s.peek()=='[' && curr==']')
                   s.pop();
                else{
                    return false;
                }
            }
        }
        
        if(!s.isEmpty())
        return false;
        else
        return true;
        
    }
    
    public static void main(){
        String str="{({[]}){]}";
        
        System.out.println(isValid(str));
    }
}