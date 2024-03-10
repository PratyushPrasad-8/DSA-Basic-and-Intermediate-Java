package ContinueBreak;

import java.util.*;
class till10{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        for(;;){
            int n=sc.nextInt();
            if(n%10==0)
            break;
            System.out.println("PASSED");
        }
        System.out.println("OUT OF LOOP");
    }
}