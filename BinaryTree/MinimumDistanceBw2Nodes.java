package BinaryTree;
public class MinimumDistanceBw2Nodes{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int minimumDistance(Node root,int n1,int n2){
        if(root==null){
            return -1;
        }
        
        if(root.data==n1 || root.data==n2){
            return 1;
        }
        
        int left=minimumDistance(root.left,n1,n2);
        int right=minimumDistance(root.right,n1,n2);
        
        if(left==-1 && right==-1){
            return -1;
        }
        
        if(left==-1){
            return right+1;
        }
        
        if(right==-1){
            return left+1;
        }
        
        System.out.println(left+right);
        return -1;
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
        
        int n1=2;
        int n2=6;
        minimumDistance(root,n1,n2);
    }
}