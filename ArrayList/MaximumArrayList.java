package ArrayList;

import java.util.ArrayList;
class MaximumArrayList{
    public static void main(){
        int max=Integer.MIN_VALUE;
        
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        list.add(2,9);
        
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        
        System.out.println(max);
    }
}