package com.lintrip.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 最长公共前戳的测试用例
 */
public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] targetArray1 = new String[]{"flower", "flow", "flight"};
        String result1 = solution.longestCommonPrefix(targetArray1);
        Assert.assertEquals("fl", result1);

        String[] targetArray2 = new String[]{"dog", "racecar", "car"};
        String result2 = solution.longestCommonPrefix(targetArray2);
        Assert.assertEquals("", result2);
    }
}