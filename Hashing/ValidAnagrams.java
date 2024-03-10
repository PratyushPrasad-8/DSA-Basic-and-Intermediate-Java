package Hashing;
import java.util.HashMap;

public class ValidAnagrams{
    public static void main(){
        String s="racte";
        String t="cartte";
        
        if(s.length()!=t.length()){
            System.out.println(false);
        }
        
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            char curr=t.charAt(i);
            
            if(!hm.containsKey(curr)){
                System.out.println(false);
                break;
            }else{
                hm.put(curr,hm.get(curr)-1);
            }
            
            if(hm.get(curr)==0){
                hm.remove(curr);
            }
        }
        
        if(!hm.isEmpty()){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}