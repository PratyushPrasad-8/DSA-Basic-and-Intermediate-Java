package Graphs;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class WordLadder{
    public static class Pair{
        String word;
        int level;
        
        Pair(String word,int level){
            this.word=word;
            this.level=level;
        }
    }
    
    public static int getWordLadder(String words[],String start,String end){
        HashSet <String> s=new HashSet<>();
        for(int i=0;i<words.length;i++){
            s.add(words[i]);
        }
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(start,1));
        
        while(!q.isEmpty()){
            Pair curr=q.remove();
            if(curr.word.compareTo(end)==0){
                return curr.level;
            }
        
            for(int i=0;i<curr.word.length();i++){
                char arr[]=curr.word.toCharArray();
                
                for(int j=97;j<=122;j++){
                    arr[i]=(char)j;
                    String temp=new String(arr);
                    if(s.contains(temp)){
                        q.add(new Pair(temp,curr.level+1));
                        
                        s.remove(temp);
                    }
                }
            }
        }
        
        return 0;
    }
    
    public static void main(){
        String words[]={"poon", "plee", "same", "poie", "plea", "plie", "poin"};
        String start="toon";
        String end="poon";
        
        System.out.println(getWordLadder(words,start,end));
    }
}