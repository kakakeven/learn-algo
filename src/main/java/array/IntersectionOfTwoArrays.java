package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350.两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        // 引入 HashMap 来存储每一个值出现的次数
        Map<Integer, Integer> nums1CountMap = new HashMap<>();
        for (Integer num : nums1) {
            if (!nums1CountMap.containsKey(num)) {
                nums1CountMap.put(num, 0);
            }
            Integer count = nums1CountMap.get(num);
            count++;
            nums1CountMap.put(num, count);
        }
        // 轮询数组2 找出交集，并存放在 list 中
        for (Integer num : nums2) {
            if (nums1CountMap.containsKey(num)) {
                Integer count = nums1CountMap.get(num);
                if (count > 0) {
                    resultList.add(num);
                    count--;
                    nums1CountMap.put(num, count);
                }
            }
        }
        // List 转 Array
        int[] result = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            result[i] = num;
            i++;
        }
        return result;
    }
}
