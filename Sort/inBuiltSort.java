package Sort;

import java.util.*;
public class inBuiltSort{
    public static void main(){
        Integer arr[]={3,2,4,5,1};
        Arrays.sort(arr,Collections.reverseOrder());
        for(Integer i : arr)
        System.out.print(i+" ");
    }
}