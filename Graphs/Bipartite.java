package Graphs;
import java.util.ArrayList;

public class Bipartite{
    private static class Edge{
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
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }
    
    public static boolean ispBipartite(ArrayList<Edge> graph[],int curr,int col[],int currentColor){
        col[curr]=currentColor;
        int nextColor=(currentColor==0)?1:0;
        for(Edge e : graph[curr]){
            if(col[e.dest]==-1){
                if(ispBipartite(graph,e.dest,col,nextColor)==false){
                   return false; 
                }
            }else{
                if(col[e.dest]!=nextColor){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[5];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        createGraph(graph);
        
        int color[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }
        
        int src=0;
        System.out.println(ispBipartite(graph,src,color,0));
    }
}