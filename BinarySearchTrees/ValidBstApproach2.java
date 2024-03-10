package BinarySearchTrees;
import java.util.ArrayList;

public class ValidBstApproach2{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
    }
    
    public static void isValid(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        
        isValid(root.left,arr);
        arr.add(root.data);
        isValid(root.right,arr);
    }
    
    public static void main(){
        Node root=new Node(4);
        root.left=new Node(2);root.right=new Node(6);
        root.left.left=new Node(1);root.left.right= new Node(10);root.right.left=new Node(5);root.right.right=new Node(7);
        
        //         4
        //      /     \
        //     2       6
        //   /   \   /   \
        //  1     3  5    7 
        
        int key=10;
        ArrayList<Integer> arr=new ArrayList<>();
        isValid(root,arr);
        
        if(arr.size()==1){
            System.out.println("TRUE");
        }
        
        int i;
        for(i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                System.out.println("FALSE");
                break;
            }
        }
        
        if(i>=arr.size()-1)
        System.out.println("TRUE");
    }
}