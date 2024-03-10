package Hashing;
import java.util.HashMap;
import java.util.TreeSet;

public class SortedByFrequency{
    public static class Bundle{
        char key;
        int value;
        
        Bundle(char key,int value){
            this.key=key;
            this.value=value;
        }
    }
    
    public static void main(){
        String s="aaaccc";
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        
        TreeSet<Bundle> tm=new TreeSet<>((a,b)->b.value-a.value);
        for(Character c:hm.keySet()){
            tm.add(new Bundle(c,hm.get(c)));
        }
        
        for(Bundle b:tm){
            for(int i=1;i<=b.value;i++){
                System.out.print(b.key);
            }
        }
    }
}