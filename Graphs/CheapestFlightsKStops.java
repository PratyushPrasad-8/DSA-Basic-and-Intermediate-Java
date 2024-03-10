package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class CheapestFlightsKStops{
    public static class Edge{
        int src;
        int dest;
        int wt;
        int stops;
        
        Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
        }
        
        Edge(int s,int d,int w,int st){
            src=s;
            dest=d;
            wt=w;
            stops=st;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,100));
        
        graph[1].add(new Edge(1,2,100));
        graph[1].add(new Edge(1,3,600));
        
        graph[2].add(new Edge(2,0,100));
        graph[2].add(new Edge(2,3,200));
    }
    
    static int finalAns=Integer.MAX_VALUE;
    
    public static void dfs(ArrayList<Edge> graph[],int curr,int dest,int K,int stopCount,int result,boolean vis[]){
        if(stopCount>K){
            return ;
        }
        
        if(curr==dest){
            finalAns=Math.min(finalAns,result);
        }
        
        vis[curr]=true;
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                dfs(graph,e.dest,dest,K,stopCount+1,result+e.wt,vis);
            }
        }
        vis[curr]=false;
    }
    
    public static void bfs(ArrayList<Edge> graph[],int V,int K,int dest){
        boolean vis[]=new boolean[V];
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)-> a.wt-b.wt);
        int dist[]=new int [V];
        int src=0;
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        
        pq.add(new Edge(-1,0,0,-1));
        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                
                for(Edge e : graph[curr.dest]){
                    if(dist[e.src]+e.wt<dist[e.dest] && curr.stops+1<=K){
                        dist[e.dest]=dist[e.src]+e.wt;
                        
                        e.stops=curr.stops+1;
                        pq.add(e);
                    }
                }
            }
        }
        
        finalAns=dist[dest];
    }
    
    public static void main(){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        
        int K=1;
        int dest=3;
        //dfs(graph,0,dest,K,-1,0,new boolean[V]);
        bfs(graph,V,K,dest);
        
        if(finalAns==Integer.MAX_VALUE){
            System.out.print(-1);
        }else{
            System.out.print(finalAns);
        }
    }
}