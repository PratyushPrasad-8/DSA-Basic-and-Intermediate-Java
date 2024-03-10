package ArrayList;

import java.util.ArrayList;
public class pairSum1_2Pointers{
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target)
            return true;
            
            if(list.get(lp)+list.get(rp)<target)
            lp++;
            else
            rp--;
        }
        return false;
    }
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        
        int target=5;
        
        System.out.println(pairSum(list,target));
    }
}