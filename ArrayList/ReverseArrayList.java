package ArrayList;

import java.util.ArrayList;
class ReverseArrayList{
    public static void main(){
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        
        System.out.println("ORIGINAL : \n"+list+"\nAFTER REVERSING : ");
        
        for(int i=list.size()-1;i>=0;i--)
        System.out.print(list.get(i)+" ");
    }
}