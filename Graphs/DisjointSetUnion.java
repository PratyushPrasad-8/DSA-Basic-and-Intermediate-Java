package Graphs;

public class DisjointSetUnion{
    static int parent[];
    static int rank[];
    DisjointSetUnion(int n){
        parent=new int[n];
        rank=new int[n];
        
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    
    public static int findParent(int x){
        if(parent[x]==x){
            return x;
        }
        
        return parent[x]=findParent(parent[x]);
    }
    
    public static void union(int a,int b){
        int parA=findParent(a);
        int parB=findParent(b);
        
        if(rank[parA]<rank[parB]){
            parent[parA]=parB;
        }else if(rank[parA]>rank[parB]){
            parent[parB]=parA;
        }else{
            parent[parB]=parA;
            rank[parA]++;
        }
    }
    
    public static void main(){
        DisjointSetUnion ob=new DisjointSetUnion(10);
        
        System.out.println(ob.findParent(5));
        union(3,4);
        union(5,3);
        System.out.println(ob.findParent(5));
    }
}