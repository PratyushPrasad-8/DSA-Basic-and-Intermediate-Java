package BinaryTree;
import java.util.*;

public class LevelOrderTraversal{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void levelOrder(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);q.add(null);
        
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
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
        
        
        levelOrder(root);
    }
}