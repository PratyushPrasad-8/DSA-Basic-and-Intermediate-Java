package ArrayList;

import java.util.ArrayList;
class ListOfLists{
    public static void main(){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        
        for(int i=1;i<10;i++){
            if(i<=5)
            list2.add(2*i);
            
            list1.add(1*i);
            list3.add(3*i);
        }
        
        mainList.add(list1);mainList.add(list2);mainList.add(list3);
        System.out.println("CHECK : "+mainList);
        
        for(int i=0;i<mainList.size();i++){
            for(int j=0;j<mainList.get(i).size();j++){
                System.out.print(mainList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}