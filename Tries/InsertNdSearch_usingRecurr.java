package Tries;


public class InsertNdSearch_usingRecurr{
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
    
    public static boolean search(Node root,String word,int idx){
        if(idx>=word.length()){
            return root.eow;
        }
        char currChar=word.charAt(idx);
        if(root.children[currChar-'a']==null){
            return false;
        }
        
        return search(root.children[currChar-'a'],word,idx+1);
    }
    
    public static boolean del(Node root,String word,int idx){
        if(idx>=word.length()){
            return true;
        }
        
        char currChar=word.charAt(idx);
        if(del(root.children[currChar-'a'],word,idx+1)){
            root.children[currChar-'a']=null;
        }else{
            return false;
        }
        
        for(int i=0;i<26;i++){
            if(root.children[currChar-'a'] != null){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(){
        Node root=new Node();
        insert(root,"apple",0);
        insert(root,"apply",0);
        insert(root,"zebra",0);
        insert(root,"zebronics",0);
        
        System.out.println(search(root,"apply",0));
        del(root,"apply",0);
        System.out.println(search(root,"apply",0));
    }
}