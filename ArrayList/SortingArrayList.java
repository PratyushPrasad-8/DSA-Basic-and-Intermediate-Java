package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList{
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        
        {
            list.add(5);
            list.add(2);
            list.add(6);
            list.add(7);
            list.add(1);  
        }
        
        System.out.println("BEFORE SORTING : "+list);
        
        Collections.sort(list,Collections.reverseOrder());
        
        System.out.println("AFTER SORTING : "+list);
    }
}