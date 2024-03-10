package BinaryTree;

public class TopViewApproach2{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        
        int left=height(root.left);
        int right=height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    public static void topView(Node root,int arr[][],int hd,int dp){
        if(root==null){
            return;
        }
        
        if(arr[0][hd]==-1 || dp<arr[1][hd]){
            arr[0][hd]=root.data;
            arr[1][hd]=dp;
        }
        
        topView(root.left,arr,hd-1,dp+1);
        topView(root.right,arr,hd+1,dp+1);
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
        
        
        int ht=height(root);
        int arr[][]=new int[2][5];
        for(int i=0;i<arr[0].length;i++){
            arr[0][i]=-1;
        }
        
        int hd=arr[0].length/2;
        int dp=0;
        topView(root,arr,hd,dp);
        
        for(int i=0;i<arr[0].length;i++){
            System.out.print(arr[0][i]+" ");
        }
    }
}