package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
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
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
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
    
    public static void BFS(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                BFSUtil(graph,i,vis);
                System.out.println();
            }
        }
    }
    
    public static void BFSUtil(ArrayList<Edge> graph[],int src,boolean vis[]){
        Queue<Integer> q=new LinkedList<>();
        
        q.add(src);
        
        while(!q.isEmpty()){
            int curr=q.remove();
            
            if(!vis[curr]){
                vis[curr]=true;
                
                System.out.print(curr+" ");
                
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[10];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();    
        }
        
        //createConnectedGraph(graph);
        createDisconnectedGraph(graph);
        
        BFS(graph);
    }
}