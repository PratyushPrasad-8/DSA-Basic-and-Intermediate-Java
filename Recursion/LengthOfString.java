package Recursion;

class LengthOfString{
    public static int length(String s,int pos){
        if(s.charAt(pos)=='.')
        return 0;
        
        return 1+length(s,pos+1);
    }
    
    public static void main(){
        String s="HELLO PRATYUSH IS A VERY VERY SMART GUY.";
        s+=".";
        
        System.out.print(length(s,0));
    }
}