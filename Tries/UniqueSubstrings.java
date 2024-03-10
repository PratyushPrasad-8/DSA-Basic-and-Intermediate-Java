package Tries;

public class UniqueSubstrings{
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
    
    public static void getSuffixIntoTrie(Node root,String word){
        for(int i=0;i<word.length();i++){
            insert(root,word.substring(i),0);
        }
    }
    
    public static int countNodes(Node root){
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);    
            }
        }
        
        return count+1;
    }
    
    public static void main(){
        Node root=new Node();
        
        String word="ababa";
        getSuffixIntoTrie(root,word);
        System.out.println(countNodes(root));
    }
}