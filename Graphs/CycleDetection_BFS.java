package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class CycleDetection_BFS{
    public static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
            wt=1;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1));
        //graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        //graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        //graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,2));
        //graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }
    
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Queue <Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int curr=q.remove();
            set.add(curr);
                
            for(Edge e : graph[curr]){
                 if(!vis[e.dest]){
                     q.add(e.dest);
                     vis[e.dest]=true;
                 }else{
                     if(!set.contains(e.dest)){
                         return true;
                     }
                 }
            }
        }
        
        return false;
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        createGraph(graph);
        
        System.out.println(isCycle(graph));
    }
}