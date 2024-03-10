package Stacks;
import java.util.Stack;
public class NextGreaterElement{
    public static void findnxtGreater(int arr[],int nextGreater[]){
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            
            s.push(i);
        }
    }
    public static void main(){
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        
        findnxtGreater(arr,nextGreater);
        for(Integer i:nextGreater){
            System.out.print(i+" ");
        }
    }
}