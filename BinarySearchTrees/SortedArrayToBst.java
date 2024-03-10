package BinarySearchTrees;
import java.util.Queue;
import java.util.LinkedList;

public class SortedArrayToBst{
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
   
   public static Node createBst(int arr[],int st,int end){
       if(st>=end){
           return new Node(arr[st]);    
       }
       
       int mid=st+(end-st)/2;
       
       Node root=new Node(arr[mid]);
       root.left=createBst(arr,st,mid-1);
       root.right=createBst(arr,mid+1,end);
       
       return root;
   }
   
   public static void main(){
       int arr[]={3,5,6,8,10,11,12};
       
       Node root=createBst(arr,0,arr.length-1);
       
       print(root);
   }
}