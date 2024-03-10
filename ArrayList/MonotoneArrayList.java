package ArrayList;

import java.util.ArrayList;
class MonotoneArrayList{
    public static boolean check(ArrayList<Integer> list){
        if(monotonicIncreasing(list) || monotonicDcreasing(list)){
            return true;
        }
        
        return false;
    }
    
    public static boolean monotonicIncreasing(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1))
            return false;
        }
        return true;
    }
    
    public static boolean monotonicDcreasing(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1))
            return false;
        }
        return true;
    }
    
    public static void main(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(9);
        
        System.out.println(check(list));
    }
}