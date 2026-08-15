
public class StockBuyandSell {
    public static void StockBuyandSell(int[] prices){

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
        for(int p:prices){
            minPrice = Math.min(minPrice, p);
            maxProfit = Math.max(maxProfit, p - minPrice);
             System.out.println("Maximum profit is: " + maxProfit+"  min: "+minPrice+"  p: "+p);
        }
        System.out.println("Maximum profit is: " + maxProfit);
    }
public static void main(String [] args){
    int [] prices = {7,1,5,3,6,4};
    StockBuyandSell(prices);

}
}
