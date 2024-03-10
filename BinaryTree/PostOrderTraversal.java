package BinaryTree;
public class PostOrderTraversal{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
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
        
        
        postOrder(root);
    }
}