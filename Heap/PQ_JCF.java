package Heap;

import java.util.*;
public class PQ_JCF{
    static class Student{// implements Comparable<Student>{
    int roll;
    String name;

    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
        }
        
    //@Override 
    //public int compareTo(Student s2){
    //    return s2.roll-this.roll;
    //    }
    }
      
    
    public static void main(){
           /**
        public static void main(){
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        
            System.out.println(pq.peek());
            pq.add(1);
            pq.add(5);
            pq.add(7);
            pq.add(-1);
            System.out.println(pq.remove());
            System.out.println(pq.remove());
        }*/
        
        PriorityQueue<Student> pq=new PriorityQueue<>((a,b)->b.roll-a.roll);
        
        pq.add(new Student(1,"abc"));
        pq.add(new Student(2,"ab"));
        pq.add(new Student(3,"a"));
        
        System.out.println(pq.remove().name);
        System.out.println(pq.remove().name);
    }
}