package ArrayList;

import java.util.ArrayList;
class SwapTwoNumbersArrayList{
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        
        {
            list.add(5);
            list.add(2);
            list.add(6);
            list.add(7);
            list.add(1);  
        }
        
        System.out.println("ORIGINAL : "+list);
        
        int idx1=1;
        int idx2=3;
        
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        
        System.out.println("AFTER SWAPPING : "+list);
    }
}