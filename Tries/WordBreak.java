package Tries;

public class WordBreak{
    public static class Node{
        Node children[];
        boolean eow;
        
        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            
            eow=false;
        }
    }
    
    public static void insert(Node root,String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            
            curr=curr.children[idx];
        }
        
        curr.eow=true;
    }
    
    public static boolean search(Node root,String word){
        Node curr=root;
        
        for(int i=0;i<word.length();i++){
            char currChar=word.charAt(i);
            if(curr.children[currChar-'a']==null){
                return false;
            }
            
            curr=curr.children[currChar-'a'];
        }
        
        return curr.eow;
    }
    
    public static boolean solution(Node root,String key){
        if(key.length()==0){
            return true;
        }
        
        for(int i=0;i<key.length();i++){
           if(search(root,key.substring(0,i+1)) && solution(root,key.substring(i+1))){
               return true;
           }
        }
        
        return false;
    }
    
    public static void main(){        
        String words[]={"i","like","sam","samsung","mobile","ice"};
        String key="ilikesamsung";
        
        Node root=new Node();
        for(int i=0;i<words.length;i++){
            insert(root,words[i]);
        }
        
        System.out.println(solution(root,key));
    }
}