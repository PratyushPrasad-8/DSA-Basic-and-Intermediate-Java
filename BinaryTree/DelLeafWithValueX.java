package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class DelLeafWithValueX{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void print(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);q.add(null);
        
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    
    public static Node delLeaf(Node root,int x){
        if(root==null){
            return null;
        }
        
        Node left=delLeaf(root.left,x);
        Node right=delLeaf(root.right,x);
        
        if(left==null){
            root.left=null;
        }
        
        if(right==null){
            root.right=null;
        }
        
        if(left==null && right==null && root.data==x){
            return null;
        }
        
        return root;
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(6);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(6);root.right.right=new Node(6);
        
        //         1
        //      /     \
        //     2       3
        //   /   \   /   \
        //  4     5  6    7 
        
        int x=6;
        print(root);
        System.out.println("\n-------------------------------------DELETED----------------------");
        delLeaf(root,x);
        print(root);
    }
}