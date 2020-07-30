package com.lintrip.array;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices1 = new int[]{7,1,5,3,6,4};
        int profit1 = solution.maxProfit(prices1);
        Assert.assertEquals(7,profit1);

        int[] prices2 = new int[]{1,2,3,4,5};
        int profit2 = solution.maxProfit(prices2);
        Assert.assertEquals(4,profit2);
    }
}