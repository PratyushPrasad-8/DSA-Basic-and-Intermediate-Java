package BinaryTree;
public class KthLevelTree{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void printKLevel(Node root,int k){
        if(root==null){
            return;
        }
        
        if(k==1){
            System.out.print(root.data+" ");
            return;
        }
        
        printKLevel(root.left,k-1);
        printKLevel(root.right,k-1);
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
        
        
        int k=2;
        printKLevel(root,k);
    }
    
}