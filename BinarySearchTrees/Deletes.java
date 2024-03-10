package BinarySearchTrees;
import java.util.Queue;
import java.util.LinkedList;

public class Deletes{
   public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   } 
   
   public static void print(Node root){
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
   
   public static Node findInOrderSuccessor(Node root){
       while(root.left!=null){
           root=root.left;
       }
       return root;
   }
    
   public static Node del(Node root,int val){
       if(root==null){
           return null;
       }
       
       if(val>root.data){
           root.right=del(root.right,val);
       }else if(val<root.data){
           root.left=del(root.left,val);
       }else{
           if(root.left==null && root.right==null){
               return null;
           }
           
           if(root.left==null){
               return root.right;
           }
           if(root.right==null){
               return root.left;
           }
           
           Node IS=findInOrderSuccessor(root.right);
           root.data=IS.data;
           root.right=del(root.right,IS.data);
       }
       
       return root;
   }
    
    public static void main(){
        Node root=new Node(4);
        root.left=new Node(2);root.right=new Node(6);
        root.left.left=new Node(1);root.left.right= new Node(3);root.right.left=new Node(5);root.right.right=new Node(7);
        
        //         4
        //      /     \
        //     2       6
        //   /   \   /   \
        //  1     3  5    7 
        int val=6;
        print(root);
        System.out.println();
        del(root,val);
        print(root);
   }
}