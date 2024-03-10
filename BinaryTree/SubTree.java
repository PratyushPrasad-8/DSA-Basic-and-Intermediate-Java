package BinaryTree;
public class SubTree{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null){
            return false;
        }
        
        if(root.data==subRoot.data){
            if(isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public static boolean isSubTree(Node root , Node subRoot){
        if(root==null){
            return false;
        }
        
        if(root.data==subRoot.data){
            return isIdentical(root,subRoot);
        }
        
        if(isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot)){
            return true;
        }else{
            return false;
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
        
        
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);subRoot.right=new Node(5);
        
        //     2
        //   /    \
        //  4      5
        
        
        
        System.out.println(isSubTree(root,subRoot));
    }
}