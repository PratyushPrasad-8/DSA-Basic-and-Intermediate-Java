package BinaryTree;
public class LowestCommonAncestor{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static Node LCA(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        
        if(root.data==n1||root.data==n2){
            return root;
        }
        
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right,n1,n2);
        
        if(left==null){
            return right;
        }
        
        if(right==null){
            return left;
        }
        
        return root;
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
        
        int n1=6;
        int n2=7;
        System.out.println(LCA(root,n1,n2).data);
    }
}