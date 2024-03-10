 package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgoritm{
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
    
    public static class Pair{
        int n;
        int dis;
        
        Pair(int n,int dis){
            this.n=n;
            this.dis=dis;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        
        graph[2].add(new Edge(2,4,3));
        
        graph[3].add(new Edge(3,5,1));
        
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[6];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        createGraph(graph);
        
        int src=0;
        
        int dist[]=new int[graph.length];
        boolean vis[]=new boolean[graph.length];
        
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
                        
        pq.add(new Pair(src,0));
        
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            
            if(!vis[curr.n]){
                vis[curr.n]=true;
                
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u=e.src;
                    int wt=e.wt;
                    int v=e.dest;

                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        
        for(int i=0;i<graph.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
}