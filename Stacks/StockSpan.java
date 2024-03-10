package Stacks;
import java.util.Stack;

public class StockSpan{
    public static int stockSpan(int stock[]){
        Stack<Integer> s=new Stack<>();
        int helper[]=new int[stock.length];
        
        helper[0]=1;
        s.push(0);
        int maxSpan=1;
                
        for(int i=1;i<stock.length;i++){
            while(!s.isEmpty() && stock[s.peek()]<stock[i]){
                s.pop();
            }
            
            if(s.isEmpty())
            helper[i]=-1;
            else
            helper[i]=s.peek();
            
            int currSpan=i-helper[i];
            maxSpan=Math.max(maxSpan,currSpan);
            
            s.push(i);
        }
        
        return maxSpan;
    }
    public static void main(){
        int stock[]={100,70,400};
        
        System.out.println(stockSpan(stock));
    }
}