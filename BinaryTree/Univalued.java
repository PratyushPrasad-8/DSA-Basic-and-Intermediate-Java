package BinaryTree;
import java.util.HashMap;

public class Univalued{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static boolean isUnivalued(Node root,HashMap<Integer,Integer> map){
        if(root==null){
            return true;
        }
        
        if(map.containsKey(root.data)){
            return false;
        }
        
        map.put(root.data,root.data);
        boolean left=isUnivalued(root.left,map);
        boolean right=isUnivalued(root.right,map);
        
        if(left==false || right==false){
            return false;
        }
        
        return true;
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(3);
        root.left.left=new Node(2);root.left.right= new Node(5);root.right.left=new Node(6);root.right.right=new Node(7);
        
        //         1
        //      /     \
        //     2       3
        //   /   \   /   \
        //  4     5  6    7 
        
        System.out.println(isUnivalued(root,new HashMap<>()));
    }
}