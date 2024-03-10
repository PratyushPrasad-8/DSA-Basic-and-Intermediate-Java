package LinkedList;
public class MergeSort{
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    public static Node getMid(Node temp){
        Node slow=temp;
        Node fast=temp.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public static Node merge(Node left,Node right){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(left!=null && right!=null){
            if(left.data<right.data){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        
        if(left!=null){
            temp.next=left;
        }
        
        if(right!=null){
            temp.next=right;
        }
        
        return mergedll.next;
    }
    
    public static Node mergeSort(Node temp){
        if(temp.next==null){
            return temp;
        }
        
        Node mid=getMid(temp);
        
        Node leftHead=temp;
        Node rightHead=mid.next;
        mid.next=null;
        
        Node left=mergeSort(leftHead);
        Node right=mergeSort(rightHead);
        
        return merge(left,right);
    }
    
    public static void main(){
        head=new Node(5);
        head.next=new Node(11);
        head.next.next=new Node(1);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(3);
        
        print();
        Node temp=mergeSort(head);
        head=temp;
        print();
    }
}