package BinarySearchTrees;
import java.util.ArrayList;

public class RootToLeaf{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static void path(Node root,ArrayList<Integer> arr){
       if(root.left==null && root.right==null){
           arr.add(root.data);
           System.out.println(arr);
           arr.remove(arr.size()-1);
           return;
       }
       
       arr.add(root.data);
       path(root.left,arr);
       path(root.right,arr);
       arr.remove(arr.size()-1);
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
        
        
        path(root,new ArrayList<>());
   }
}