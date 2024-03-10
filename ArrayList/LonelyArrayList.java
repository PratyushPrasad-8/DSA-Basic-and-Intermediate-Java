package ArrayList;

import java.util.ArrayList;
class LonelyArrayList{
    public static void lonely(int helper[]){
        int n=helper.length;
        if(helper[0]==1 && helper[1]==0)
        System.out.print(0+" ");
        
        for(int i=1;i<n-1;i++){
            if(helper[i]==1 && helper[i-1]==0 && helper[i+1]==0){
                System.out.print(i+" ");
            }
        }
        
        if(helper[n-1]==1 && helper[n-2]==0)
        System.out.print(n-1+" ");
    }
    
    public static void main(){
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        
        int helper[]=new int[max+1];
        for(int i=0;i<list.size();i++)
        helper[list.get(i)]++;
        
        lonely(helper);
    }
}