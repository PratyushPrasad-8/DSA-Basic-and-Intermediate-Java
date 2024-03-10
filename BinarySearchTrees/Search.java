package BinarySearchTrees;

public class Search{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static boolean search(Node root,int key){
       if(root==null){
           return false;
       }
       
       if(root.data==key){
           return true;
       }
       
       if(key>root.data){
           return search(root.right,key);
       }else{
           return search(root.left,key);
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
        
        int key=10;
        System.out.println(search(root,key));
   }
}