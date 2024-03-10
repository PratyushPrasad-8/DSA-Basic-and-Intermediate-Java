package BinarySearchTrees;

public class KthSmallestElement{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   static int c=1;
   
   public static void Ksmallest(Node root,int k){
       if(root==null){
           return ;
       }
       
       Ksmallest(root.left,k);
       if(c==k){
           System.out.println(root.data);
           c++;
       }else{
           c++;
       }
       Ksmallest(root.right,k);
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
        
        int k=3;
        Ksmallest(root,k);
   }
}
