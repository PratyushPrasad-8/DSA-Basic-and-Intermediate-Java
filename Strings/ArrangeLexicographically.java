package Strings;

public class ArrangeLexicographically{
    public static void arrange(String s[]){
        for(int i=0;i<s.length-1;i++){
            int min=i;
            for(int j=i+1;j<s.length;j++){
                if(s[min].compareTo(s[j])>0)
                min=j;
            }
            
            String temp=s[min];
            s[min]=s[i];
            s[i]=temp;
        }
    }
    
    public static void print(String s[]){
        for(int i=0;i<s.length;i++)
        System.out.print(s[i]+" ");
    }
    public static void main(){
        String s[]={"apple","mango","orange","banana","watermelon","guava"};
        
        arrange(s);
        print(s);
    }
}