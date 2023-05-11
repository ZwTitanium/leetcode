package greedyalgorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : zhaiwei
 * @create 2023/5/5 20:21
 */
public class MaxProfit {
    public static void main(String args[]) {
        int []prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1])
                maxprofit += prices[i + 1] - prices[i];
        }
        return maxprofit;
    }
}
