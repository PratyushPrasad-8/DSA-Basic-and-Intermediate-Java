package Graphs;
import java.util.ArrayList;

public class NumberofNodesinCycle{
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
        //graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        //graph[2].add(new Edge(2,0));
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
    
    public static int calNodes(ArrayList<Edge> graph[],int curr,int dest,boolean vis[],int count){
        vis[curr]=true;
        count+=1;
        
        if(curr==dest){
            return count;
        }
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                int val=calNodes(graph,e.dest,dest,vis,count);
                if(val!=-1){
                    return val;
                }
            }
        }
        
        count-=1;
        return -1;
    }
    
    public static int countNodesinCycle(ArrayList<Edge> graph[],int curr,int parent,boolean vis[]){
        vis[curr]=true;
        
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                int val=countNodesinCycle(graph,e.dest,curr,vis);
                if(val!=-1){
                    return val;
                }
            }else{
                if(e.dest!=parent){
                    return calNodes(graph,e.dest,curr,new boolean[graph.length],0);
                }
            }
        }
        
        return -1;
    }
    
    public static void main(){
        ArrayList<Edge> graph[]=new ArrayList[7];
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        createGraph(graph);
        
        System.out.println(countNodesinCycle(graph,0,-1,new boolean[graph.length]));
    }
}