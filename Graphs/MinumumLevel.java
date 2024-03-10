package Graphs;

import java.util.*;
public class MinumumLevel{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int getMinLevel(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);q.add(null);
        
        int currLevel=0;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                currLevel++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(curr.left==null && curr.right==null){
                    break;
                }
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        
        return currLevel;
    }
    
     public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(3);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(6);//root.right.right=new Node(7);
        
        //         1
        //      /     \
        //     2       3
        //   /   \    / 
        //  4     5  6   
        
        
        System.out.println(getMinLevel(root));
    }
}