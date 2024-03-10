package Stacks;
import java.util.Stack;
public class ReverseString{
    public static String reverse(Stack<Character> s , StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            s.push(sb.charAt(i));
        }
        
        sb=new StringBuilder("");
        
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        
        return sb.toString();
    }
    
    public static void main(){
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder("pratyush");
        System.out.println(reverse(s,sb));
    }
}