package BackTracking;

public class Permutations{
    public static void perm(String s,String ans){
        if(s.length()==0){
            System.out.println(ans+" ");
            return;
        } 
        
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String newStr=s.substring(0,i)+s.substring(i+1);
            perm(newStr,ans+curr);
        }
    }
    public static void mian(){
        String s="abcd";
        
        perm(s,"");
    }
}