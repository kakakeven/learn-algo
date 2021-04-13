package com.lintrip.dp;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int maxF = nums[0];
        int minF = nums[0];
        int ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1,0,-1,-2};
        System.out.println(maxProduct(array));
    }

}
