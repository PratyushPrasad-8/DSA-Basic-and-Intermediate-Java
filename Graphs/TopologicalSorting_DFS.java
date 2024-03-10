package Graphs;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting_DFS{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,0));
        
        graph[1].add(new Edge(1,1));
        
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    
    
    public static void topologicalSort(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalUtil(graph,i,vis,s);
            }
        }
        
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    
    public static void topologicalUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                topologicalUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[6];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        //createConnectedGraph(graph);
        createGraph(graph);
        
        topologicalSort(graph);
    }
}