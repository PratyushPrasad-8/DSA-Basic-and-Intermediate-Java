package Tries;

public class InsertNdSearch_usingFor{
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
    
    public static void main(){
        Node root=new Node();
        insert(root,"apple");
        insert(root,"app");
        insert(root,"apply");
        insert(root,"banana");
        insert(root,"banned");
        
        System.out.println(search(root,"apples"));
    }
}