package Graphs;
import java.util.ArrayList;

public class CreatingGraph{
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
    
    public static void main(){
        //0      2 --- 4
        // \   /   \  
        //   1  ---  3
        
        // 1 --- 0 5        6        9
        // |      /        / \
        // 2 --- 3        7   8
        //        \
        //         4
        
        ArrayList<Edge> graph[]=new ArrayList[10];
        
        for(int i=0;i<10;i++){
            graph[i]=new ArrayList<>();
        }
        
        //createConnectedGraph(graph);
        createDisconnectedGraph(graph);
        
        for(int i=0;i<10;i++){
            for(Edge j:graph[i]){
                System.out.print(" ("+j.src+" , "+j.dest+") ");
            }
            System.out.println();
        }
    }
}