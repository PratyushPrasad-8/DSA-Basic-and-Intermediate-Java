package Greedy;
import java.util.Arrays;
import java.util.Comparator;

class ActivitySelection_OR_MaximumLengthChain{
    public static int maxActivity(int start[],int end[]){
        Integer activity[][]=new Integer[start.length][3];
        
        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        
        Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));
        
        int ans=1;
        int endTime=activity[0][2];
        System.out.print("A"+activity[0][0]+" ");
        
        for(int i=1;i<activity.length;i++){
            if(activity[i][1] >= endTime){
                ans++;
                endTime=activity[i][2];
                System.out.print("A"+activity[i][0]+" ");
            }
        }
        
        System.out.println();
        return ans;
    }
    
    public static void mian(){
        int start[]={10,12,20};
        int end[]={20,25,30};
        
        System.out.println("MAX ACTIVITY = "+maxActivity(start,end));
    }
}