package Stacks;
public class StackCall2{
    public static void main(){
        ImplementationViaLL ob = new ImplementationViaLL();
                    
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