package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims{
    public static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
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
    
    public static int prims(ArrayList<Edge> graph[],int V){
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        boolean vis[]=new boolean[V];
        int finalAns=0;
        ArrayList<Edge> arr=new ArrayList<>();
        pq.add(new Edge(-1,0,0));
        
        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                finalAns+=curr.wt;
                arr.add(new Edge(curr.src,curr.dest,curr.wt));
                
                for(Edge e : graph[curr.dest]){
                    pq.add(new Edge(e.src,e.dest,e.wt));
                }
            }
        }
        
        arr.remove(0);
        for(Edge e : arr){
            System.out.println(e.src+" "+e.dest);
        }
        
        return finalAns;
    }
    
    public static void main(){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        
        System.out.print("ANSWER : "+prims(graph,V));
    }
}