package Tries;

public class substrings{
    public static void substring(String s,int idx){
        if(idx>=s.length()){
            return;
        }
        
        for(int i=idx;i<s.length();i++){
            String a=s.substring(idx,i+1);
            System.out.print(a+" ");
        }
        substring(s,idx+1);
    }
    
    public static void main(){
        String s="abcde";
        
        substring(s,0);
    }
}