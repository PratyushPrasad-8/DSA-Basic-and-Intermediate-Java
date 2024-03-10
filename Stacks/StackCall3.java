package Stacks;
import java.util.Stack;

public class StackCall3{
    public static void main(){
        Stack<Integer> ob = new Stack<>();
                    
        ob.push(1);
        ob.push(2);
        ob.push(3);
                    System.out.println(ob.isEmpty());
                    
                    while(!ob.isEmpty()){
                        System.out.print(ob.pop()+" ");
                    }
                    System.out.println();
        
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.pop();
                    while(!ob.isEmpty()){
                        System.out.print(ob.pop()+" ");
                    }
                    System.out.println();
                    
                    System.out.println(ob.isEmpty());
    }
}