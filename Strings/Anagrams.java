package Strings;

import java.util.*;
public class Anagrams{
    public static boolean anagrams(StringBuilder sb1,StringBuilder sb2){
        if(sb1.length()!=sb2.length())
        return false;
        
        for(int i=0;i<sb1.length();i++){
            int flag=0;
            for(int j=0;j<sb2.length();j++){
                if(sb1.charAt(i)==sb2.charAt(j))
                flag++;
            }
            if(flag==0)
            return false;
        }
        return true;
    }
    public static void main(){
        StringBuilder sb1= new StringBuilder("race");
        StringBuilder sb2= new StringBuilder("eraca");
        
        System.out.println(anagrams(sb1,sb2));
    }
}