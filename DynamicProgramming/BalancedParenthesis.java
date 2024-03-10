package DynamicProgramming;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;

public class BalancedParenthesis{
    public static void generate(int open,int closed,int n,String s){
        if(closed==n){
            System.out.print(s+" ");
            return;
        }
        
        if(open<n){
            generate(open+1,closed,n,s+"(");
        }
        
        if(closed<open){
            generate(open,closed+1,n,s+")");
        }
    }
    
    public static void main(){
        int n=4;
        
        generate(0,0,n,"");
    }
}
    
    /**
     * public static void main(){
        int n=4;
        
        Queue<String> q=new LinkedList<>();
        HashSet<String> hs=new HashSet<>();
         
        q.add("");
        q.add("N");
        int count=0;
        
        while(!q.isEmpty()){
            String curr=q.remove();
        
            if(curr.compareTo("N")==0){
                count++;
                if(count!=n){
                    q.add("N");
                }else{
                    break;
                }
            }else{
                //left
                String left=curr+"{}";
                //mid
                String mid="{"+curr+"}";
                //right
                String right="{}"+curr;
            
                if(!hs.contains(left)){
                    q.add(left);
                    hs.add(left);
                }
                if(!hs.contains(mid)){
                    q.add(mid);
                    hs.add(mid);
                }
                if(!hs.contains(right)){
                    q.add(right);
                    hs.add(right);
                }
            }
        }
        
        System.out.println(q.size());
        while(!q.isEmpty()){
            System.out.print(q.remove()+"  ");
        }
    }
     */
