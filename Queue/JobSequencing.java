package Queue;
public class JobSequencing{
    public static String maxProfit(int jobProfit[],int jobDeadline[],char job[]){
        int maxDeadline=0,n=jobProfit.length;
        for(int i=0;i<jobDeadline.length;i++){
            maxDeadline=Math.max(maxDeadline,jobDeadline[i]);
        }
        
        boolean occupied[]=new boolean[maxDeadline+1];
        char ans[]=new char[maxDeadline+1];
        String finalAns="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-i-1;j++){
                if(jobProfit[j]<jobProfit[j+1]){
                    int temp=jobProfit[j];
                    jobProfit[j]=jobProfit[j+1];
                    jobProfit[j+1]=temp;
                    
                    temp=jobDeadline[j];
                    jobDeadline[j]=jobDeadline[j+1];
                    jobDeadline[j+1]=temp;
                    
                    char t=job[j];
                    job[j]=job[j+1];
                    job[j+1]=t;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(!occupied[jobDeadline[i]]){
                occupied[jobDeadline[i]]=true;
                ans[i]=job[i];
            }
        }
        
        for(int i=0;i<maxDeadline+1;i++){
            if(occupied[i])
            finalAns+=ans[i];
        }
        
        return finalAns;
    }
    public static void main(){
        int jobProfit[]={20,10,40,30};
        int jobDeadline[]={4,1,1,1};
        char job[]={'a','b','c','d'};
        
        System.out.println(maxProfit(jobProfit,jobDeadline,job));
    }
}