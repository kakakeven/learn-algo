package com.lintrip.array;

/**
 * 122. 买卖股票的最佳时机 II
 * <p>
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
 *
 * @author kakakeven
 */
public class BestTimeToBuyAndSellStock {

    /**
     * PS：这个题目不需要知道每次买卖操作的节点，当时买入、卖出的价格，只需要关心可以取得的最大利益
     * 所以如果是上涨趋势都是赚钱的，赚得的利润等于当前价-上一个节点的价格；
     * 而如果是下降趋势，可以认为是没有操作的，直接跳过
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (null == prices || prices.length <= 1) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int before = prices[i - 1];
            int current = prices[i];
            if (before < current) {
                profit += (current - before);
            } else {
                continue;
            }
        }
        return profit;
    }
}
