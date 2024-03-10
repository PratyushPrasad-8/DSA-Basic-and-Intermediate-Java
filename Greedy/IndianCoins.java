package Greedy;

class IndianCoins{
    public static void main(){
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        int value=596;
        
        int i=coins.length-1,ans=0;
        while(value!=0){
            int c=0;
            while(coins[i]<=value){
               c++;
               value-=coins[i];  
               ans++;
            }
            
            if(c!=0){
                System.out.print(c+"-"+coins[i]+"   ");
            }
            
            i--;
        }
        System.out.println("\n TOTAL DENOMINATIONS = "+ans);
    }
}