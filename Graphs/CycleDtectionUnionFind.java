package Graphs;
import java.util.ArrayList;

public class CycleDtectionUnionFind{
    public static class DSU{
        static int rank[];
        static int parent[];
        
        DSU(int n){
            rank=new int[n];
            parent=new int[n];
            
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        
        public static int find(int x){
            if(parent[x]==x){
                return x;
            }
            
            return parent[x]=find(parent[x]);
        }
        
        public static void union(int x , int y){
            int parA=find(x);
            int parB=find(y);
            
            if(rank[parA]>rank[parB]){
                parent[parB]=parA;
            }else if(rank[parB]>rank[parA]){
                parent[parA]=parB;
            }else{
                parent[parB]=parA;
                rank[parA]++;
            }
        }
    }
    
    public static class Edge{
        int src;
        int dest;
        
        Edge(int s,int d){
            src=s;
            dest=d;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[1].add(new Edge(1,5));
        //graph[1].add(new Edge(1,9));
        
        graph[2].add(new Edge(2,5));
        graph[2].add(new Edge(2,7));
        
        graph[5].add(new Edge(5,1));
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,9));
        
        graph[7].add(new Edge(7,2));
               
        //graph[9].add(new Edge(9,1));
        graph[9].add(new Edge(9,5));
    }
    
    public static boolean main(){
        int V=10;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        
        DSU dsu=new DSU(V);
        boolean vis[]=new boolean[V];
        
        for(int i=0;i<V;i++){
            vis[i]=true;
            for(Edge e : graph[i]){
                if(!vis[e.src] || !vis[e.dest]){
                    int parA=dsu.find(e.src);
                    int parB=dsu.find(e.dest);
                    
                    if(parA==parB){
                        return true;
                    }else{
                        dsu.union(e.src,e.dest);
                    }
                }
            }
        }
        return false;
    }
}