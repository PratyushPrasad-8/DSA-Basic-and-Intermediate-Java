package Stacks;
import java.util.Stack;

class PallindromeLinkedList{
        public static class Node{
        Node next;
        char data;
        Node(char data){
            this.data=data;
            next=null;
        }
    }
    
    public static boolean isPallindrome(){
        Stack<Character> s =new Stack<>();
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            s.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            s.push(slow.data);            
        }
        slow=slow.next;
        
        while(slow!=null){
            if(s.pop()!=slow.data)
            return false;
            
            slow=slow.next;
        }
        return true;
        
    }
    public static Node head;
    public static void main(){
        head=new Node('a');
        head.next=new Node('b');
        head.next.next=new Node('a');
        head.next.next.next=new Node('a');
        //head.next.next.next.next=new Node('f');
        
        if(isPallindrome()){
            System.out.println("YES IT IS PALLINDROME");
        }else{
            System.out.println("NO IT IS NOT PALLINDROME");
        }
    }
}