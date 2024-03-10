package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static class Bundle{
        int hd;
        Node node;
        
        Bundle(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    public static void topView(Node root,Queue<Bundle> q,HashMap<Integer,Node> map){
        int max=0;
        int min=0;
        q.add(new Bundle(root,0));
        
        while(!q.isEmpty()){
            Bundle curr=q.remove();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            
            if(curr.node.left!=null){
                q.add(new Bundle(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            
            if(curr.node.right!=null){
                q.add(new Bundle(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(3);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(6);root.right.right=new Node(7);
        
        //         1
        //      /     \
        //     2       3
        //   /   \   /   \
        //  4     5  6    7 
        
        HashMap<Integer,Node> map=new HashMap<>();
        Queue<Bundle> q= new LinkedList<>();
        topView(root,q,map);
    }
}