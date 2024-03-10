package Graphs;
import java.util.ArrayList;
import java.util.Stack;

public class KosaRaju{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int s ,int d){
            src=s;
            dest=d;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        
        graph[2].add(new Edge(2,1));
        
        graph[3].add(new Edge(3,4));
    }
    
    public static void topSort(ArrayList<Edge> graph[],int curr,Stack<Integer> s,boolean vis[]){
        vis[curr]=true;
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                topSort(graph,e.dest,s,vis);
            }
        }
        
        s.push(curr);
    }
    
    public static void reverse(ArrayList<Edge> graph[],ArrayList<Edge> transpose[],int V){
        for(int i=0;i<V;i++){
            transpose[i]=new ArrayList<>();
        }
        
        for(int i=0;i<V;i++){
            for(Edge e : graph[i]){
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    
    public static void SCC(ArrayList<Edge> graph[],int V){        
        Stack<Integer> s=new Stack<>();
        
        topSort(graph,0,s,new boolean[V]);
        
        ArrayList<Edge> transpose[]=new ArrayList[V];
        reverse(graph,transpose,V);
        
        boolean vis[]=new boolean[V];
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();    
            }
        }
    }
    
    public static void main(){
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        
        SCC(graph,V);
    }
}