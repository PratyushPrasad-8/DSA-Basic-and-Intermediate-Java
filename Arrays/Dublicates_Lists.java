package Arrays;

import java.util.ArrayList;
public class Dublicates_Lists{
    public static boolean test(int arr[]){
        ArrayList<Integer> ob=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(ob.contains(arr[i]))
            return true;
            else
            ob.add(arr[i]);
        }
        
        return false;
    }
    public static void main(){
        int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        
        System.out.println(test(arr));
    }
}