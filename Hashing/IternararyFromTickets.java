package Hashing;
import java.util.HashMap;

public class IternararyFromTickets{
    public static void main(){
        HashMap<String,String> hm= new HashMap<>();
        hm.put("Chennai","Bengaluru");
        hm.put("Mumbai","Delhi");
        hm.put("Goa","Chennai");
        hm.put("Delhi","Goa");
        
        String st="";
        
        for(String k : hm.keySet()){
            if(!hm.containsValue(k)){
                st=k;
                break;
            }
        }
        
        System.out.print(st);
        while(st!=null){
            st=hm.get(st);
            
            if(st!=null){
                System.out.print(" -> "+st);     
            }
           
        }
    }
}