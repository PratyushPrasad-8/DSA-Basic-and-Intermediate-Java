package DynamicProgramming;

public class LongestPallindromicSubsequence{
    public static boolean isPallindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
    
    public static int LPS(String s,int idx,String sb){
        if(idx>=s.length()){
            if(isPallindrome(sb)){
                System.out.print(sb+" ");
                return sb.length();
            }
            return 0;
        }
        
        int notInclude=LPS(s,idx+1,sb);
        int include=LPS(s,idx+1,sb+s.charAt(idx));
        
        return Math.max(notInclude,include);
    }
    
    public static void main(){
        String s="bbbab";
        
        System.out.println(LPS(s,0,""));
    }
}