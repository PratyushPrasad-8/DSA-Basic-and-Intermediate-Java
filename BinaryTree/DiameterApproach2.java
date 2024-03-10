package BinaryTree;

public class DiameterApproach2{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        
        int left=height(root.left);
        int right=height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        
        int lh=height(root.left);
        int rh=height(root.right);
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int currDiameter=lh+rh+1;
        
        return Math.max(currDiameter,Math.max(ld,rd));
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(3);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(6);root.right.right=new Node(7);
        
        //         1
        //      /     \
        //     2       3
        //   /   \   /   \
        //  4     5  6    7 
        
        
        System.out.println("DIAMETER OF TREE = "+diameter(root));
    }
}