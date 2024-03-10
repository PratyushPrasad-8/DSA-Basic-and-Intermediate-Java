package Graphs;
import java.util.ArrayList;

public class MotherVertex{
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
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
    
    public static void getMother(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                getMother(graph,e.dest,vis);
            }
        }
    }
    
    public static void main(){
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        int i;
        for(i=0;i<V;i++){
            boolean vis[]=new boolean[V];
            getMother(graph,i,vis);
            
            for(int j=0;j<V;j++){
                if(vis[j]==false){
                    continue;
                }
            }
            break;
        }
        
        if(i>=V){
            System.out.println("NO MOTHER VERTEX");
        }else{
            System.out.println("MOTHER VERTEX : "+i);
        }
    }
}