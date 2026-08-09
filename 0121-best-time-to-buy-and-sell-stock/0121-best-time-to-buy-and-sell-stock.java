class Solution {
    public int maxProfit(int[] price) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<price.length;i++){
            if(min_price>price[i])
            min_price=price[i];
            else if(price[i]-min_price>max_profit){
                max_profit=price[i]-min_price;
            }
        }
        return max_profit;
    }
}