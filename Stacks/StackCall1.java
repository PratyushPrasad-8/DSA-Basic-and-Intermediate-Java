package Stacks;
public class StackCall1{
    public static void main(){
        ImplementationViaAL ob = new ImplementationViaAL();
                    
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