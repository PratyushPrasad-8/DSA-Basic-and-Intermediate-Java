package BinarySearchTrees;
import java.util.ArrayList;

public class TwoBstPairSum{
    public static class Node{
       int data;
       Node left,right;
       
       Node(int data){
           this.data=data;
           left=right=null;
       }
   }
   
   public static void increasing(Node root,ArrayList<Integer> arr){
       if(root==null){
           return ;
       }
       
       increasing(root.left,arr);
       arr.add(root.data);
       increasing(root.right,arr);
   }
   
   public static void decreasing(Node root,ArrayList<Integer> arr){
       if(root==null){
           return ;
       }
       
       decreasing(root.right,arr);
       arr.add(root.data);
       decreasing(root.left,arr);
   }
   
    public static void main(){
        Node root1=new Node(5);
        root1.left=new Node(3);root1.right=new Node(7);
        root1.left.left=new Node(2);root1.left.right= new Node(4);root1.right.left=new Node(6);root1.right.right=new Node(8);
        
        //         5
        //      /     \
        //     3       7
        //   /   \   /   \
        //  2     4  6    8 
        
        Node root2=new Node(10);
        root2.left=new Node(6);root2.right=new Node(15);
        root2.left.left=new Node(3);root2.left.right= new Node(8);root2.right.left=new Node(11);root2.right.right=new Node(18);
        
        //         10
        //      /     \
        //     6      15
        //   /   \   /   \
        //  3     8 11    18 
        int x=16;
        
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        
        increasing(root1,l);
        decreasing(root2,r);
        
        int lp=0;
        int rp=0;
        int count=0;
        System.out.println(l+" "+r);
        
        while(lp<l.size() && rp<r.size()){
            if(l.get(lp)+r.get(rp)<x){
                lp++;
            }else if(l.get(lp)+r.get(rp)>x){
                rp++;
            }else{
                count++;
                System.out.print("( "+l.get(lp)+" , "+r.get(rp)+" )");
                lp++;rp++;
            }
        }
        
        System.out.println(" "+count);
    }
}