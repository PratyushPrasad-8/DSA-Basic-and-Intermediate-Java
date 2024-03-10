package Graphs;
import java.util.ArrayList;

public class AllPathsFromSrcToTarget{
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
        graph[0].add(new Edge(0,3));
        
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    
    public static void getAllPath(ArrayList<Edge> graph[],int curr,int dest,ArrayList<Integer> arr,boolean vis[]){
        if(curr==dest){
            arr.add(curr);
            System.out.println(arr);
            arr.remove(arr.size()-1);
            return;
        }
        
        vis[curr]=true;
        arr.add(curr);
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                getAllPath(graph,e.dest,dest,arr,vis);
            }
        }
        
        vis[curr]=false;
        arr.remove(arr.size()-1);
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[6];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        createGraph(graph);
        
        int src=5;
        int dest=1;
        getAllPath(graph,src,dest,new ArrayList<>(),new boolean[graph.length]);
    }
}