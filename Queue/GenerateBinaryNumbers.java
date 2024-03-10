package Queue;
import java.util.Queue;
import java.util.LinkedList;

class GenerateBinaryNumbers{
    public static void generate(int N){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        int count=1;
        
        for(int i=1;i<=N;i++){
            int s=q.remove();
            System.out.print(s+" ");
            
            if(count<=N){
                q.add(s*10);
                q.add(s*10+1);
                count+=2;
            }
        }
    }
    
    public static void main(){
        int N=10;
        
        generate(N);
    }
}