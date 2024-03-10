package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kruskal{
    public static class DSU{
        static int parent[];
        static int rank[];
        DSU(int n){
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
    }
    
    
    public static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    
    public static void kruskals(ArrayList<Edge> graph[],int V){
        PriorityQueue<Edge> pq =new PriorityQueue<>((a,b)-> a.wt-b.wt);
        DSU dsu=new DSU(V);
        int count=0;
        int finalCost=0;
        ArrayList<Edge> arr=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            for(Edge e : graph[i]){
                pq.add(e);
            }
        }
        
        while(count<V-1){
            Edge e = pq.remove();
            int parA=dsu.findParent(e.src);
            int parB=dsu.findParent(e.dest);
            
            if(parA!=parB){
                finalCost+=e.wt;
                arr.add(e);
                dsu.union(parA,parB);
                count++;
            }
        }
        
        for(Edge e : arr){
            System.out.println(e.src+" "+e.dest);
        }
        System.out.println(finalCost);
    }
    
    public static void main(){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        
        kruskals(graph,V);
    }
}