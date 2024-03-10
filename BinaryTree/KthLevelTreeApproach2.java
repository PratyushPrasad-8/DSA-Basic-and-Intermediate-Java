package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class KthLevelTreeApproach2{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static void KthLevelTreeApproach2(Node root,int k){
        Queue<Node> q=new LinkedList<>();
        q.add(root);q.add(null);
        
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                k--;
                if(k==0){
                    break;
                }
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(k==1){
                    System.out.print(curr.data+" ");
                }
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        
        if(k!=0){
            System.out.println(k+" IS VERY LARGE");
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
        
        int k=3;
        KthLevelTreeApproach2(root,k);
    }
}