package Graphs;
import java.util.ArrayList;

public class HasPath{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        //graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }
    
    public static boolean isPath(ArrayList<Edge> graph[],int curr,int dest,boolean vis[]){
        if(curr==dest){
            return true;
        }
        
        vis[curr]=true;
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                if(isPath(graph,e.dest,dest,vis)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[7];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        createGraph(graph);
        
        System.out.println(isPath(graph,0,6,new boolean[graph.length]));
    }
}