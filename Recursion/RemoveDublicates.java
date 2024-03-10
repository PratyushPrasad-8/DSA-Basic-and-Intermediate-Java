package Recursion;

class RemoveDublicates{
    public static void remove(String s,int pos,boolean checkBox[],StringBuilder sb){
        if(pos==s.length()){
            System.out.println(sb);
            return;
        }

        
        if(!checkBox[s.charAt(pos)-'a']){
            sb.append(s.charAt(pos));
            checkBox[s.charAt(pos)-'a']=true;
        }
        
        remove(s,pos+1,checkBox,sb);
    }
    public static void main(){
        String s="abcdeabfghef";
        boolean checkBox[]=new boolean[26];
        
        remove(s,0,checkBox,new StringBuilder(""));
    }
}