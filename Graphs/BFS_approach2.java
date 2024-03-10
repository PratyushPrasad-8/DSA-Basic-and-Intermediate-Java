package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_approach2{
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
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }
    
    public static void BFS(ArrayList<Edge> graph[],int src){
        boolean vis[]=new boolean[graph.length];
        Queue<Integer> q=new LinkedList<>();
        
        q.add(src);
        vis[src]=true;
        while(!q.isEmpty()){
            int curr=q.remove();    
            System.out.print(curr+" ");
                
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    q.add(e.dest);
                    vis[e.dest]=true;
                }
            }
        }
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();    
        }
        
        createGraph(graph);
        
        BFS(graph,0);
    }
}