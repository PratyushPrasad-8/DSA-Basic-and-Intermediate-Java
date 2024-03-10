package Hashing;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllSetJCF{
    public static void main(){
        HashSet <Integer> hs=new HashSet<>();
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        
        hs.add(4);
        hs.add(2);
        hs.add(5);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);
        
        lhs.add(4);
        lhs.add(2);
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        System.out.println(lhs);
        
        ts.add(4);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);
    }
}