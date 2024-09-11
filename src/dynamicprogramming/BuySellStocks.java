package dynamicprogramming;

public class BuySellStocks {

    public int calculateMaxProfit(int[] prices){
        int mini = prices[0];
        int profit = 0;

        for(int i =1; i< prices.length; i++){
            int cost = prices[i] - mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7,1,5,3,6,4};
        BuySellStocks buySellStocks = new BuySellStocks();
        int maxProfit = buySellStocks.calculateMaxProfit(prices);
        System.out.println("Max Profit "+maxProfit);
    }
}
