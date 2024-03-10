package Graphs;
import java.util.ArrayList;

public class DirectedCycles{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    
    public static void createDirectedGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,0));
    }
    
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,new boolean[graph.length])){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        
        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[curr]){
                if(!vis[e.dest]){
                    if(isCycleUtil(graph,e.dest,vis,stack)==true){
                        return true;
                    }
                }else{
                    if(stack[e.dest]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[4];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        createDirectedGraph(graph);
        
        System.out.println(isCycle(graph));
    }
}