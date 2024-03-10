package BinarySearchTrees;

public class ValidBst{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static boolean isValid(Node root,int min,int max){
       if(root==null){
           return true;
       }
       
       if(!(root.data>=min && root.data<=max)){
           return false;
       }
       
       return isValid(root.left,min,root.data-1) && isValid(root.right,root.data+1,max);
   }
   
   public static void main(){
        Node root=new Node(4);
        root.left=new Node(2);root.right=new Node(6);
        root.left.left=new Node(1);root.left.right= new Node(10);root.right.left=new Node(5);root.right.right=new Node(7);
        
        //         4
        //      /     \
        //     2       6
        //   /   \   /   \
        //  1     10  5    7 
        
        System.out.println(isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
   }
}