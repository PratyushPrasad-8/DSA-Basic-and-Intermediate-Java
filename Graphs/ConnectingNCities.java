package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectingNCities{
    public static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
        }
    }
    
    public static int minCost(int cities[][],int V){
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        boolean vis[]=new boolean[V];
        int finalCost=0;
        ArrayList<Edge> arr=new ArrayList<>();
        pq.add(new Edge(-1,0,0));
        
        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                finalCost+=curr.wt;
                arr.add(curr);
                for(int i=0;i<V;i++){
                    if(cities[curr.dest][i]!=0){
                        pq.add(new Edge(curr.dest,i,cities[curr.dest][i]));
                    }
                }
            }
        }
        arr.remove(0);
        for(Edge e : arr){
            System.out.println(e.src+","+e.dest);
        }
        
        
        return finalCost;
    }
    
    public static void main(){
        int cities[][]={{0,1,2,3,4},
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}};
        int V=cities.length;
        
        System.out.println(minCost(cities,V));
    }
}