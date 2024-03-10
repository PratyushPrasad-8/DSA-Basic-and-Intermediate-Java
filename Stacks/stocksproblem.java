package Stacks;
import java.util.Stack;

public class stocksproblem {
    public static void Solve(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i = 1;i<stocks.length;i++){
            int curr = stocks[i];
            while(!s.isEmpty() && curr> stocks[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int PrevHigh=s.peek();
                span[i]=i-PrevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[]={100,80,60,70,60,85,100};
        int span[]= new int [stocks.length];
        Solve(stocks,span);
        for(int i = 0; i <span.length;i++){
            System.out.print (span[i]+ " ");
        }
    }
}