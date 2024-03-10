package ContinueBreak;

import java.util.*;
class except10{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        for(;;){
            int n=sc.nextInt();
            if(n%10==0)
            continue;
            System.out.println("PASSED "+n);
        }
    }
}