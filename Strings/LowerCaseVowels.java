package Strings;

import java.util.Scanner;
public class LowerCaseVowels{
    public static int count(StringBuilder sb){
        int c=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
            c++;
        }
        return c;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        
        System.out.println("ENTER A SENTENCE : ");
        sb.append(sc.nextLine());
        
        System.out.println("NUMBER OF LOWER CASE VOWELS ARE : "+count(sb));
    }
}