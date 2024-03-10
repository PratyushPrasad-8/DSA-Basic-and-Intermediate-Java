package BinaryTree;
public class Diameter{
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
        int diameter;
        int height;
        
        Bundle(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    
    public static Bundle diameter(Node root){
        if(root==null){
            return new Bundle(0,0);
        }
        
        Bundle leftBundle=diameter(root.left);
        Bundle rightBundle=diameter(root.right);
        
        int currDiameter=Math.max(leftBundle.height+rightBundle.height+1,Math.max(leftBundle.diameter,rightBundle.diameter));
        int currHeight=Math.max(leftBundle.height,rightBundle.height)+1;
        
        return new Bundle(currDiameter,currHeight);
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
        
        
        System.out.println("DIAMETER OF TREE = "+diameter(root).diameter);
    }
}