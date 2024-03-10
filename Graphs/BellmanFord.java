package Graphs;
import java.util.ArrayList;

public class BellmanFord{
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
        
        graph[0].add(new Edge(0,1,-1));
        
        graph[1].add(new Edge(1,2,3));
        graph[1].add(new Edge(1,3,-4));
        
        graph[2].add(new Edge(2,3,5));
    }
    
    public static void bellmanFord(ArrayList<Edge> graph[],int V,int dist[]){
        for(int i=1;i<V;i++){
            for(int j=0;j<V;j++){
                for(Edge e : graph[j]){
                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.src]+e.wt<dist[e.dest]){
                        dist[e.dest]=dist[e.src]+e.wt;
                    }
                }
            }
        }
    }
    
    public static void main(){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        
        createGraph(graph,V);
        
        int dist[]=new int[V];
        int src=0;
        
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;    
            }
        }
        
        bellmanFord(graph,V,dist);
        
        for(Integer i : dist){
            System.out.print(i+" ");
        }
    }
}