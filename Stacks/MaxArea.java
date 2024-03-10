package Stacks;
import java.util.Stack;

public class MaxArea{
    public static int findMaxArea(int heights[]){
        int n=heights.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            
            s.push(i);
        }
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            
            s.push(i);
        }
        
        int maxArea=0;
        
        for(int i=0;i<n;i++){
           int currArea=heights[i]*(nsr[i]-nsl[i]-1);
           maxArea=Math.max(maxArea,currArea);
        }
        
        return maxArea;
    }
    public static void main(){
        int heights[]={2,1,5,6,2,3};
        
        System.out.println(findMaxArea(heights));
    }
}