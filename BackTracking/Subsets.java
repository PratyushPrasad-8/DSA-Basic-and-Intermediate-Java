package BackTracking;

public class Subsets{
    public static void subSets(String s,int pos,String newStr){
        if(pos==s.length()){
            if(newStr.length()==0)
            System.out.println("NULL");
            else
            System.out.println(newStr+" ");
            return;
        }
        
        char curr=s.charAt(pos);
        if(curr=='a'){
            subSets(s,pos+1,newStr+curr);
        }else{
            subSets(s,pos+1,newStr+curr);
            subSets(s,pos+1,newStr);
        }
    }
    
    public static void main(){
        String s="abcdef";
        
        subSets(s,0,"");
    }
}
