package Graphs;
import java.util.ArrayList;

public class ConnectedOrDisconnected{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    
    public static void createConnectedGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        
        graph[4].add(new Edge(4,2));
    }
    
    public static void createDisconnectedGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,3));
        
        graph[5].add(new Edge(5,3));
        
        graph[6].add(new Edge(6,7));
        graph[6].add(new Edge(6,8));
        
        graph[7].add(new Edge(7,6));
        
        graph[8].add(new Edge(8,6));
        
        graph[9].add(new Edge(9,9));
    }
    
    public static void visit(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        
        for(Edge e: graph[curr]){
            if(!vis[e.dest]){
                visit(graph,e.dest,vis);
            }
        }
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[10];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        //createConnectedGraph(graph);
        createDisconnectedGraph(graph);
        boolean vis[]=new boolean[graph.length];
        visit(graph,0,vis);
        
        int flag=0;
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                flag=1;
            }
        }
        
        if(flag==1){
            System.out.print("DISCONNECTED");
        }else{
            System.out.print("CONNECTED");
        }
    }
}