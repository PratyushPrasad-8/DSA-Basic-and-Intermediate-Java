package Hashing;

public class BottomViewBT{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void bottomView(Node root){
        if(root==null){
            System.out.print(" ");
            return;
        }
        
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
            return;
        }
        
        bottomView(root.left);
        bottomView(root.right);
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
        
        bottomView(root);
    }
}