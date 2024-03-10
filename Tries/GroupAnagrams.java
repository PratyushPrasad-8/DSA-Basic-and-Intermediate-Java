package Tries;
import java.util.ArrayList;
import java.util.HashSet;

public class GroupAnagrams{
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
            return true;
        }
        char currChar=word.charAt(idx);
        if(root.children[currChar-'a']==null){
            return false;
        }
        
        return search(root.children[currChar-'a'],word,idx+1);
    }
    
    public static void solution(Node root,String temp,String word,ArrayList<String> al,HashSet<String> hs){
        if(word.length()==0){
            if(search(root,temp,0)){
                al.add(temp);
                hs.add(temp);
            }
            return;
        }
        
        for(int i=0;i<word.length();i++){
            if(search(root,temp+word.charAt(i),0))
            solution(root,temp+word.charAt(i),word.substring(0,i)+word.substring(i+1),al,hs);
        }
    }
    
    public static void main(){
        Node root=new Node();
        String arr[]={"eat","tea","tan","ate","nat","bat","tab","axe","smart"};
        
        for(int i=0;i<arr.length;i++){
            insert(root,arr[i],0);
        }
        
        ArrayList<ArrayList<String>> al=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                ArrayList<String> temp=new ArrayList<>();
                solution(root,"",arr[i],temp,hs);
                al.add(temp);
            }
        }
        
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }
}