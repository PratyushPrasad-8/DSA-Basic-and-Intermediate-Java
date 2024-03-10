package Recursion;

class AllPossibleSubStrings{
    public static int call(int st,int end,String s,String k,int count){
        if(end==s.length())
        return count;
        
        k+=s.charAt(end);
        if(k.charAt(0)==k.charAt(k.length()-1)){
            count++;
        }
        
        return call(st,end+1,s,k,count);
    }
    
    public static void main(){
        String s="aba";
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            ans+=call(i,i,s,"",0);
        }
        
        System.out.println(ans);
    }
}