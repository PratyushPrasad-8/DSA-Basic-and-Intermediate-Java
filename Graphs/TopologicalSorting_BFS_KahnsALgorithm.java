package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting_BFS_KahnsALgorithm{
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
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    
    public static void calIndgree(int indegree[], ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[i]){
                indegree[e.dest]++;
            }
        }
    }
    
    public static void topologicalSort(ArrayList<Edge> graph[]){
        int indegree[]=new int[graph.length];
        Queue<Integer> q= new LinkedList<>();
        calIndgree(indegree,graph);
        
        for(int i=0;i<graph.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            
            for(Edge e : graph[curr]){
                indegree[e.dest]--;
                
                if(indegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[6];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        createGraph(graph);
        
        topologicalSort(graph);
    }
}