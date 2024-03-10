package Greedy;
import java.util.Arrays;
import java.util.Comparator;

class FractinalKnapSack{
    public static void main(){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        
        double data[][]=new double[value.length][3];
        
        for(int i=0;i<data.length;i++){
            data[i][0]=weight[i];
            data[i][1]=value[i];
            data[i][2]=(value[i]/(double)weight[i]);
        }
        
        Arrays.sort(data,Comparator.comparingDouble(o -> o[2]));
        
        int i=data.length-1,ans=0;
        while(w!=0){
            if(data[i][0]<=w){
                w-=data[i][0];
                ans+=data[i][1];
            }else{
                ans+=data[i][2]*w;
                w=0;
            }
            i--;
        }
        
        System.out.println(" MAX PROFIT = "+ans);
    }
}