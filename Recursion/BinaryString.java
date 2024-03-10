package Recursion;

class BinaryString{
    public static void allPossibleWays(int n , char prev, String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        
        allPossibleWays(n-1,'0',s+"0");
        if(prev!='1')
        allPossibleWays(n-1,'1',s+"1");
    }
    
    public static void main(){
        int n=3;
        
        allPossibleWays(n,'0',"");
    }
}