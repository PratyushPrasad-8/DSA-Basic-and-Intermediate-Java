package BinaryTree;
import java.util.ArrayList;

public class LowestCommonAncestorApproach2{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static Node route(Node root,ArrayList<Node> list,int n){
        if(root==null){
            return null;
        }
        
        if(root.data==n){
            list.add(root);
            return root;
        }
        
        list.add(root);
        
        Node left=route(root.left,list,n);
        Node right=route(root.right,list,n);
        
        if(left==null && right==null){
            list.remove(list.size()-1);
            return null;
        }
        
        return root;
    }
    
    public static void LCA(Node root,int n1,int n2){
        ArrayList<Node> list1=new ArrayList<>();
        ArrayList<Node> list2=new ArrayList<>();

        route(root,list1,n1);
        route(root,list2,n2);
        
        int p1=0,p2=0;
        
        while(p1!=list1.size() && p2!=list2.size()){
            if(list1.get(p1).data!=list2.get(p2).data){
                break;
            }
            p1++;p2++;
        }
        
        System.out.println(list1.get(p1-1).data);
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
        
        int n1=4;
        int n2=5;
        LCA(root,n1,n2);
    }
}