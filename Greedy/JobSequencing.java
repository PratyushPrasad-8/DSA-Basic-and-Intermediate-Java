package Greedy;
import java.util.ArrayList;
import java.util.Collections;



class JobSequencing{
        public static class job{
        int id;
        int profit;
        int deadLine;
    
        job(int id,int profit,int deadLine){
            this.id=id;
            this.profit=profit;
            this.deadLine=deadLine;
        }
    }
    public static void main(){
        int profit[]={20,10,40,30};
        int deadLine[]={4,1,1,1};
        
        ArrayList<job> jobs=new ArrayList<>();
        
        for(int i=0;i<profit.length;i++){
            jobs.add(new job(i,profit[i],deadLine[i]));
        }
        
        Collections.sort(jobs,(a,b) -> b.profit-a.profit);
        
        int time=1,ans=0;
        for(int i=0;i<jobs.size();i++){
           if(jobs.get(i).deadLine >= time){
               ans+=jobs.get(i).profit;
               time++;
               System.out.print(((char)(jobs.get(i).id+65))+" ");
           }
        }
        
        System.out.println(ans);
    }
}