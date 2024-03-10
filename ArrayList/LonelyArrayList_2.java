package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
class LonelyArrayList_2{
    public static void lonely(ArrayList<Integer> list){
        int n=list.size();
        if((list.get(1) != list.get(0)+1) && list.get(1) != list.get(0))
        System.out.print(list.get(0)+" ");
        
        for(int i=1;i<n-1;i++){
            if((list.get(i)+1 != list.get(i+1)) && (list.get(i)-1 != list.get(i-1)) && ((list.get(i) != list.get(i+1))) && (list.get(i) != list.get(i-1)))
            System.out.print(list.get(i)+" ");
        }
        
        if((list.get(n-2) != list.get(n-1)-1) && list.get(n-2) != list.get(n-1))
        System.out.print(list.get(n-1)+" ");
    }
    
    public static void main(){
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        
        Collections.sort(list);

        lonely(list);
    }
}