package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class StreamFirstNonRepeating{
    public static void calStream(String s){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
            int val=curr-'a';
            freq[val]++;
            if(freq[val]<=1){
                q.add(curr);
            }
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            
            if(q.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        
    }
    public static void main(){
        String s="aabccxb";
        
        calStream(s);
    }
}