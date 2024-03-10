package Greedy;
import java.util.Stack;

class MaximumBalancedStringPartitions{
    public static void main(){
        String str="LRRRRLLRLLRL";
        
        /**
        * Stack<Character> s= new Stack<>();
        s.push(str.charAt(0));
        char factor=str.charAt(0);
        
        int x=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==factor){
                s.push(str.charAt(i));
            }else{
                s.pop();
            }
            
            if(s.isEmpty()){
                x++;
                
                if(i==str.length()-1)
                break;
                
                factor=str.charAt(i+1);
            }
        }
        */
        
        int x=0,l=0,r=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L'){
                l++;
            }else{
                r++;
            }
            
            if(l==r){
                x++;
            }
        }
        System.out.println(x);
    }
}