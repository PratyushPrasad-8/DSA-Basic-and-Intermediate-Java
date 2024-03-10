package Stacks;
import java.util.Stack;
public class PushAtBottom{
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int val=s.pop();
        pushBottom(s,data);
        s.push(val);
    }
    
    public static void main(){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int data=0;
                
        System.out.println(s);
        pushBottom(s,data);
        System.out.println(s);
    }
}