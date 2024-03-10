package Tries;

public class StartsWith{
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
    
    public static boolean search(Node root,String word,int idx){
        if(idx>=word.length()){
            return true;
        }
        char currChar=word.charAt(idx);
        if(root.children[currChar-'a']==null){
            return false;
        }
        
        return search(root.children[currChar-'a'],word,idx+1);
    }
    
    public static void main(){
        Node root=new Node();
        
        String arr[]={"apple","app","mango","man","woman"};
        for(int i=0;i<arr.length;i++){
            insert(root,arr[i]);
        }
        
        String key="app";
        System.out.println(search(root,key,0));
        
    }
}