package BinarySearchTrees;

public class ClosestElement{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static Node closest(Node root,int key){
       if(root==null){
           return null;
       }
       
       Node temp;
       
       if(root.data<key){
           temp=closest(root.right,key);
       }else if(root.data>key){
           temp=closest(root.left,key);
       }else{
           temp=root;
       }
       
       if(temp==null || temp==root){
           return root;
       }
       
       if(Math.abs(temp.data-key)<Math.abs(root.data-key)){
           return temp;
       }else{
           return root;
       }
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
        
        int key=4;
        System.out.println(closest(root,key).data);
   }
}