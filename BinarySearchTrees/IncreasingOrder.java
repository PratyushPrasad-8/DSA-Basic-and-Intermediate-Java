package BinarySearchTrees;
import java.util.Stack;

public class IncreasingOrder{
     public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static void fill(Node root,Stack<Node> s){
       if(root==null){
           return;
       }
       
       s.push(root);
       fill(root.left,s);
   }
   
   public static int getIncreasingOrder(Stack<Node> s){
       Node node=s.pop();
       
       if(node.right!=null){
           fill(node.right,s);
       }
       
       return node.data;
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
        
        Stack<Node> s= new Stack<>();
        fill(root,s);
        while(!s.isEmpty()){
            System.out.print(getIncreasingOrder(s)+" ");    
        }
   }
}