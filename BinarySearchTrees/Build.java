package BinarySearchTrees;
import java.util.Queue;
import java.util.LinkedList;

public class Build{
   public static class Node{
       int data;
       Node left,right;
       
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
   
   public static Node build(Node root,int val){
       if(root==null){
           return new Node(val);
       }
       
       if(val>root.data){
           root.right=build(root.right,val);
       }else{
           root.left=build(root.left,val);
       }
       return root;
   }
   
   public static void main(){
       int arr[]={5,1,3,4,2,7};
       Node root=null;
       
       for(int i=0;i<arr.length;i++){
           root = build(root,arr[i]);
       }
       
       print(root);
   }
}