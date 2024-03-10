package Stacks;
import java.util.ArrayList;

public class ImplementationViaAL{
    ArrayList<Integer> al=new ArrayList<>();
    
    public boolean isEmpty(){
        return al.size()==0;
    }
    
    public void push(int data){
        al.add(data);
    }
    
    public int pop(){
        if(al.size()==0)
        return -1;
        
        int val=al.remove(al.size()-1);
        return val;
    }
    
    public int peek(){
        if(al.size()==0)
        return -1;
        
        return al.get(al.size()-1);
    }
    
    public int size(){
        return al.size();
    }
}