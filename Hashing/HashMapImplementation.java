package Hashing;
import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapImplementation{
    public static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        
        private  int n,N;
        private LinkedList<Node> bucket[];
        private int Thresold=2;
        private int factor=2;
        
        HashMap(){
            n=0;
            N=5;
            
            bucket=new LinkedList[N];
            for(int i=0;i<N;i++){
                bucket[i]=new LinkedList<Node>();
            }
        }
        
        public int hashFunction(K key){
            return (Math.abs(hashCode()))%N;
        }
        
        public int searchInLL(K key,int bi){
            for(int i=0;i<bucket[bi].size();i++){
                Node node=bucket[bi].get(i);
                
                if(node.key==key){
                    return i;
                }
            }
            
            return -1;
        }
        
        private void rehashing(){
            LinkedList<Node> ll[]=bucket;
            
            N*=factor;
            bucket=new LinkedList[N];
            
            for(int i=0;i<ll.length;i++){
                for(int j=0;j<ll[i].size();j++){
                    Node node=ll[i].remove(j);
                    
                    put(node.key,node.value);
                }
            }
        }
        
        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){
                bucket[bi].add(new Node(key,value));
                n++;
            }else{
                bucket[bi].get(di).value=value;
            }
            
            double lamda=n/(double)N;
            if(lamda>=Thresold){
                rehashing();
            }
        }
        
        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){
                return null;
            }else{
                return bucket[bi].get(di).value;
            }
        }
        
        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            if(di==-1){
                return null;
            }else{
                n--;
                return bucket[bi].remove(di).value;
            }
        }
        
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            
            return di!=-1; 
        }
        
        public ArrayList<K> keySet(){
            ArrayList<K> arr=new ArrayList<>();
            
            for(int i=0;i<N;i++){
                for(int j=0;j<bucket[i].size();j++){
                    arr.add(bucket[i].get(j).key);
                }
            }
            
            return arr;
        }
        
        public boolean isEmpty(){
            return n==0;
        }
    }
    
    public static  void main(){
        HashMap<Integer,String> map=new HashMap<>();
        
                System.out.println(map.isEmpty());
        map.put(1,"India");
        map.put(2,"China");
        map.put(3,"Singapore");
        
                System.out.println(map.isEmpty());
        ArrayList<Integer> arr= new ArrayList<>();
        arr=map.keySet();
        for(Integer key : arr){
           System.out.println("KEY = "+key+" VALUE = "+map.get(key));
        }
        
        
        map.remove(2);
        System.out.println(map.get(1)+" "+map.get(2)+" "+map.get(3));
            
    }
}