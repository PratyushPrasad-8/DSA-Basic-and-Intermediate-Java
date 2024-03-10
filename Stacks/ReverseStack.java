package Stacks;
import java.util.Stack;

public class ReverseStack extends PushAtBottom {
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int val=s.pop();
        reverse(s);
        pushBottom(s,val);
    }
    
    public static void main(){
        Stack<Integer> s=new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverse(s);
        System.out.println(s);        
    }
}