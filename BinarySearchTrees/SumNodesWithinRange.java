package BinarySearchTrees;

public class SumNodesWithinRange{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static int sum(Node root,int L,int R){
       if(root==null){
           return 0;
       }
       
       int left=sum(root.left,L,R);
       int right=sum(root.right,L,R);
       
       if(root.data>=L && root.data<=R){
           return left+right+root.data;
       }else{
           return left+right;
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
        
        int L=2;
        int R=5;
        System.out.println(sum(root,L,R));
   }
}