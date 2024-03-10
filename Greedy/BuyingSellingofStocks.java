package Greedy;
class BuyingSellingofStocks{
    public static void main(){
        int prices[] = {7, 1, 5, 3, 6, 4};
        
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=buy){
                buy=prices[i];
            }else{
                int currProfit=prices[i]-buy;
                profit=Math.max(profit,currProfit);
            }
        }
        
        System.out.println(profit);
    }
}