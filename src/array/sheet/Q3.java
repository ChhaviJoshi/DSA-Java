package array.sheet;

public class Q3 {

    public static int buySellStock(int [] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < buyPrice){
                maxProfit = Math.max(maxProfit, price - buyPrice);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {7, 6, 4, 3, 1};
        System.out.println(buySellStock(prices));
    }
}
