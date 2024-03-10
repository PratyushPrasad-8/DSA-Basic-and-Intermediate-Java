package Graphs;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AllTaskPossibleOrNot{
    public static class Pair{
        int a;
        int b;
        
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    
    public static class Edge{
        int src;
        int dest;
        
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    
    public static boolean isCycle(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        
        for(int i=0;i<graph.length;i++){
            for(Edge e : graph[curr]){
                if(!vis[e.dest]){
                    if(isCycle(graph,e.dest,vis,stack)==true){
                        return true;
                    }
                }else{
                    if(stack[e.dest]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean main(){
        //int arr[][]={{1,4},{1,2},{2,3},{3,4},{4,1}};
        int arr[][]={{1,2},{2,3},{3,4},{2,4}};
        //int arr[][]={{1,2},{1,3},{2,4},{3,4}};
        
        ArrayList<Edge> graph[]=new ArrayList[arr.length+10];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        HashSet<Pair> s=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(s.contains(new Pair(arr[i][1],arr[i][0]))){
                return false;
            }else{
                s.add(new Pair(arr[i][0],arr[i][1]));
                graph[arr[i][1]].add(new Edge(arr[i][1],arr[i][0]));
            }
        }
        
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i] && graph[i].size()!=0){
                if(isCycle(graph,1,vis,new boolean[graph.length])){
                    return false;
                }
            }
        }
        
        return true;
    }
}
