package ArrayList;


import java.util.ArrayList;
class MaxFreqArrayList{
    public static int maxFrequency(ArrayList<Integer> list,int help[],int target){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==target){
                help[list.get(i+1)]++;
            }
        }
        
        int max=0;int val=0;
        for(int i=0;i<help.length;i++){
            if(help[i]>max){
                val=i;
                max=help[i];
            }
        }
        
        return val;
    }
    
    public static void main(){
        ArrayList<Integer> list= new ArrayList<>();
        
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int target=1;
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        
        int help[]=new int[max+1];
        
        System.out.println(maxFrequency(list,help,target));
    }
}