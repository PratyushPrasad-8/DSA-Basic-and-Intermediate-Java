package BinarySearchTrees;

public class PrintInRange{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static void printInRange(Node root,int k1,int k2){
       if(root==null){
           return;
       }
       
       if(root.data>=k1 && root.data<=k2){
           printInRange(root.left,k1,k2);
           System.out.print(root.data+" ");
           printInRange(root.right,k1,k2);
       }
       else if(root.data>k2){
           printInRange(root.left,k1,k2);
       }else{
           printInRange(root.right,k1,k2);
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
        
        int k1=3;
        int k2=6;
        printInRange(root,k1,k2);
   }
}