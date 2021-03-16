class Solution {
    public int maxProfit(int[] prices, int fee) {
    int cash = 0, hold = -prices[0]; // cash = sell stock , hold = initial investment amount/buy stock (cheapest stock)
        
    for(int i = 1 ; i < prices.length;i++){
        cash = Math.max(cash, hold + prices[i] - fee);
        hold = Math.max(hold, cash - prices[i]);
        System.out.println("cash :" + cash);
                    System.out.println("hold :" + hold);

    }
        return cash;
    }
}
