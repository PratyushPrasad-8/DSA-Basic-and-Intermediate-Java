package BackTracking;

public class KeyPad{
    public static void possibleWays(String s,String ans,int i,int count){
        if(i==count){
            System.out.print(ans+" ");
            return;
        }
        
        if(s=="")
        return;
        
        for(int pos=0;pos<=2;pos++){
            char curr=s.charAt(pos);
            
            String newStr=s.substring(3);
            possibleWays(newStr,ans+curr,i+1,count);
        }
    }
    public static void main(){
        int n=24;
        
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        String s="";int count=0;
        while(n!=0){
            int r=n%10;
            count++;
            s+=arr[r];
            n/=10;
        }
        
        possibleWays(s,"",0,count);
    }
}