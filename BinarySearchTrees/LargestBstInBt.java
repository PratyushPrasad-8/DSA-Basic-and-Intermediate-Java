package BinarySearchTrees;

public class LargestBstInBt{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static int largestBst(Node root,int min,int max){
       if(root==null){
           return 0;
       }
       
       if(!(root.data>=min && root.data<=max)){
           return -1;
       }
       
       int left=largestBst(root.left,min,root.data-1);
       int right=largestBst(root.right,root.data+1,max);
       
       if(left==-1 && right==-1){
           return -1;
       }else if(left==-1){
           return right;
       }else if(right==-1){
           return left;
       }else{
           return left+right+1;
       }
   }
   
   public static void main(){
        Node root=new Node(50);
        root.left=new Node(30);root.right=new Node(60);
        root.left.left=new Node(5);root.left.right= new Node(20);root.right.left=new Node(45);root.right.right=new Node(70);
        root.right.right.left=new Node(65);root.right.right.right=new Node(80);
        //          50
        //       /      \
        //     30        60
        //   /    \     /   \
        //  5     20   45    70 
        //                 /    \
        //                65    80
        
        System.out.println(largestBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
   }
}