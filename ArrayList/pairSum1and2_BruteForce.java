package ArrayList;

import java.util.ArrayList;
class pairSum1and2_BruteForce{
    public static boolean pairSum(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target)
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        {//sorted    //sorted+rotated
        list1.add(1);list2.add(11);
        list1.add(2);list2.add(15);
        list1.add(3);list2.add(6);
        list1.add(4);list2.add(8);
        list1.add(5);list2.add(9);
        list1.add(7);list2.add(10);
        }
        int target1=5;int target2=16;
        
        System.out.println(pairSum(list1,target1));
        System.out.println(pairSum(list2,target2));
    }
}