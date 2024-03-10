package BinaryTree;
import java.util.ArrayList;
import java.util.HashMap;

public class AllDublicateSubTrees{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static boolean compare(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }else if(root1==null){
            return false;
        }else if(root2==null){
            return false;
        }
        
        if(root1.data!=root2.data){
            return false;
        }
        
        boolean left=compare(root1.left,root2.left);
        boolean right=compare(root1.right,root2.right);
        
        if(left==false || right==false){
            return false;
        }
        
        return true;
    }
    
    public static void checkDublicate(Node root,ArrayList<Node> arr,HashMap<Integer,Node> map){
       if(root==null){
           return;
       }
       
       if(map.containsKey(root.data)){
           boolean result=compare(root,map.get(root.data));
           if(result){
               arr.add(root);
           }
       }else{
           map.put(root.data,root);
       }
       
       checkDublicate(root.left,arr,map);
       checkDublicate(root.right,arr,map);
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(2);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(4);root.right.right=new Node(5);
        
        //         1
        //      /     \
        //     2       2
        //   /   \   /   \
        //  4     5  4    5 
        
        ArrayList<Node> arr=new ArrayList<>();
        checkDublicate(root,arr,new HashMap<>());
        if(arr.size()==0){
            System.out.println("NO DUBLICATE SUBTREE");
        }else{
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i).data);
            }
        }
    }
}