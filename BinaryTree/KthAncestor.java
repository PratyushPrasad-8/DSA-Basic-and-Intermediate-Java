package BinaryTree;
public class KthAncestor{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int findAncestorK(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        
        if(root.data==n){
            return 1;
        }
        
        int left=findAncestorK(root.left,n,k);
        int right=findAncestorK(root.right,n,k);
        
        int curr=Math.max(left,right);
        
        if(curr==k){
            System.out.print(root.data);
        }
        
        if(curr==-1){
            return -1;
        }else{
            return curr+1;
        }
        
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
        
        int k=1;
        int n=6;
        findAncestorK(root,n,k);
    }
}