package com.lintrip.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 */
public class SingleNumber {

    public int solution01(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            if (numCountMap.containsKey(num)) {
                numCountMap.put(num, numCountMap.get(num) + 1);
            } else {
                numCountMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> numCountEntry : numCountMap.entrySet()) {
            if (numCountEntry.getValue() == 1) {
                return numCountEntry.getKey();
            }
        }
        return 0;
    }

    public int solution02(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
