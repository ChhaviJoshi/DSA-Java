package array;

public class BuySellStock {

//    public static int stockProfit (int prices[]) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            int buyPrice = prices[i];
//            for (int j = i + 1; j < prices.length; j++) {
//                int sellPrice = prices[j];
//                int profit = sellPrice - buyPrice;
//                maxProfit = Math.max(profit, maxProfit);
//            }
//        }
//        return maxProfit;
//    }

    public static int buyAndSellPrice(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    //same logic using for each loop
    public static int stockBuySell (int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(buyPrice < price) {
                maxProfit = Math.max(maxProfit, price - buyPrice);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        //System.out.println(stockProfit(prices));
        //System.out.println(buyAndSellPrice(prices));
        System.out.println(stockBuySell(prices));
    }
}
