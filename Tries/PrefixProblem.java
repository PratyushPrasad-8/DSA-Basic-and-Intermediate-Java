package Tries;

public class PrefixProblem{
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
    
    public static void insert(Node root,String word,int idx){
        if(idx>=word.length()){
            root.eow=true;
            return;
        }
        
        int pos=word.charAt(idx)-'a';
        if(root.children[pos]==null){
            root.children[pos]=new Node();
        }
        
        insert(root.children[pos],word,idx+1);
    }
    
    public static boolean preFix(Node root,String word,int idx){
        if(idx>=word.length()){
            return true;
        }
        
        int pos=word.charAt(idx)-'a';
        if(!preFix(root.children[pos],word,idx+1)){
            return false;
        }
        
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && i!=pos){
                System.out.print(word.substring(0,idx+1)+" ");
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(){
        Node root=new Node();
        String arr[]={"zebra","dog","duck","dove"};
        
        for(int i=0;i<arr.length;i++){
            insert(root,arr[i],0);
        }
        
        for(int i=0;i<arr.length;i++){
            preFix(root,arr[i],0);    
        }
    }
}