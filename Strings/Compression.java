package Strings;

public class Compression{
    public static StringBuilder compress(StringBuilder s){
        s.append(" ");
        char temp=s.charAt(0);
        Integer count=1;
        StringBuilder newString=new StringBuilder("");
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=temp){
                newString.append((count>1)?(temp+count.toString()):temp);
                temp=s.charAt(i);
                count=1;
            }
            else
            count++;
        }
        
        return newString;
    }
    public static void main(){
        StringBuilder s=new StringBuilder("aaaabbbcccccddd");
        
        System.out.println(compress(s));
    }
}