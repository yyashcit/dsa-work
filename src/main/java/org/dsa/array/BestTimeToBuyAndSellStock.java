package org.dsa.array;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int max = prices[0];
        int index = 0;
        int profit = 0;
        int i = 1;
        while (i < prices.length) {
            if (min > prices[i]) {
                min = prices[i];
                max = min;
                index = i;
            }
            while (index < prices.length) {
                if (max < prices[index]) {
                    max = prices[index];
                }
                int tempProfit = max - min;
                if (tempProfit > profit) {
                    profit = tempProfit;
                }
                index++;
            }
            i++;
        }

        return profit;
    }

}
