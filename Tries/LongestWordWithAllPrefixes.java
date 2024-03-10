package Tries;

public class LongestWordWithAllPrefixes{
    public static class Node{
        Node children[];
        boolean eow;
        
        Node(){
            children=new Node[26];
            for(Node node:children){
                node=null;
            }
            
            eow=false;
        }
    }
    
    public static void insert(Node root,String word,int idx){
        if(idx>=word.length()){
            root.eow=true;
            return;
        }
        
        char currChar=word.charAt(idx);
        if(root.children[currChar-'a']==null){
            root.children[currChar-'a']=new Node();
        }
        
        insert(root.children[currChar-'a'],word,idx+1);
    }
    
    public static int finalAns=0;
    public static String finalString="Nan";
    
    public static void getLongest(Node root,String temp){
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow){
                getLongest(root.children[i],temp+(char)(i+97));
            }
        }
        
        if(temp.length()>finalAns){
            finalAns=temp.length();
            finalString=temp;
        }
    }
    
    public static void main(){
        Node root=new Node();
        
        String words[]={"a","banana","app","appl","ap","apply","apple","applys","applyss"};
        for(int i=0;i<words.length;i++){
            insert(root,words[i],0);
        }
        
        getLongest(root,"");
        System.out.println(finalString+" "+finalAns);
    }
}