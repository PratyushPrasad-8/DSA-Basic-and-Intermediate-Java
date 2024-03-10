package Hashing;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AllMapJCF{
    public static void main(){
        HashMap<Integer,Integer> hm = new HashMap<>();
        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        
        hm.put(4,4);
        hm.put(2,2);
        hm.put(5,5);
        hm.put(3,3);
        hm.put(1,1);
        System.out.println(hm);
        
        lhm.put(4,4);
        lhm.put(2,2);
        lhm.put(5,5);
        lhm.put(3,3);
        lhm.put(1,1);
        System.out.println(lhm);
        
        tm.put(4,4);
        tm.put(2,2);
        tm.put(5,5);
        tm.put(3,3);
        tm.put(1,1);
        System.out.println(tm);
        
    }
}