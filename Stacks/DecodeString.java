package Stacks;
import java.util.Stack;

public class DecodeString{
    public static String decode(String s){
        Stack<Integer> numStack=new Stack<>();
        Stack<Character> chrStack=new Stack<>();
        int num=0;
        String ans="";
        
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr>=49 && curr<=57){
                int r=curr-48;
                num=num*10+r;
            }else{
                if(num!=0){
                    numStack.push(num);
                    num=0;
                }
                
                if(curr!=']'){
                    chrStack.push(curr);
                }else{
                    while(chrStack.peek()!='['){
                        ans=chrStack.pop()+ans;
                    }
                    chrStack.pop();
                    
                    String temp="";
                    int limit=numStack.pop();
                    for(int j=1;j<=limit;j++){
                        temp+=ans;
                    }
                    
                    for(int j=0;j<temp.length();j++){
                        chrStack.push(temp.charAt(j));
                    }
                    ans="";temp="";
                }
            }
        }
        
        while(!chrStack.isEmpty()){
            ans=chrStack.pop()+ans;
        }
        
        return ans;
    }
    
    public static void main(){
        String s="3[b2[v]cd]ll";
        
        System.out.println(decode(s));
    }
}