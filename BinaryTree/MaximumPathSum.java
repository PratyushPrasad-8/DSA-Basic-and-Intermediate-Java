package BinaryTree;

public class MaximumPathSum{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static class Bundle{
        int dist;
        int ans;
        
        Bundle(int ans,int dist){
            this.ans=ans;
            this.dist=dist;
        }
    }
    
    public static Bundle maxPath(Node root){
        if(root==null){
            return new Bundle(0,0);
        }
        
        Bundle leftBundle=maxPath(root.left);
        Bundle rightBundle=maxPath(root.right);
        
        int currAns=leftBundle.dist+rightBundle.dist+root.data;
        
        int ans=Math.max(currAns,Math.max(leftBundle.ans,rightBundle.ans));
        
        return new Bundle(ans,Math.max(leftBundle.dist,rightBundle.dist)+root.data);
    }
    
    public static void main(){
        Node root=new Node(-10);
        root.left=new Node(9);root.right=new Node(20);
        //root.left.left=new Node(4);root.left.right= new Node(5);
        root.right.left=new Node(15);root.right.right=new Node(7);
        
        //        -10
        //      /     \
        //     9      15
        //           /   \
        //          20    7 
        
        
        System.out.print(maxPath(root).ans);
    }
}