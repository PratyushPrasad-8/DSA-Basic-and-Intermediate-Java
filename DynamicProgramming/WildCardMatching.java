package DynamicProgramming;

public class WildCardMatching{
    public static boolean allStar(String pattern){
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)!='*'){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean match(String text,String pattern,int n,int m,int dp[][]){
        if(n==0 && allStar(pattern)){
            return true;
        }
        
        if(m==0){
            return false;
        }
        
        System.out.println(n+" "+m);
        
        if(text.charAt(n-1)==pattern.charAt(m-1) || pattern.charAt(m-1)=='?'){
            return match(text,pattern,n-1,m-1,dp);
        }else if(pattern.charAt(m-1)=='*'){
            return (match(text,pattern,n,m-1,dp)||match(text,pattern,n-1,m,dp));
        }else{
            return false;
        }
    }
    
    public static void main(){
        String text="baaabab";
        String pattern="*****ba*****ab";
        int n=text.length();
        int m=pattern.length();
        
        match(text,pattern,n,m,new int[n][m]);
    }
}