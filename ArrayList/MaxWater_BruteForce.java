package ArrayList;

import java.util.ArrayList;
class MaxWater_BruteForce{
    public static int storeWater(ArrayList<Integer> list){
        int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int ht=Math.min(list.get(i),list.get(j));
                int wd=j-i;
                
                int currWater=ht*wd;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        System.out.println(storeWater(list));
    }
}