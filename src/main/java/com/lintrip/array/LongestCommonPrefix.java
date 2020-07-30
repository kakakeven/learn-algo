package com.lintrip.array;

/**
 * 14.最长公共前缀
 * <p>
 * 找字符串数组中的最长公共前缀。如果不存在公共前缀，则返回""
 *
 * @author kakakeven
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // 如果字符串数据为空，则返回 null
        if (null == strs || strs.length == 0) {
            return "";
        }
        // 以第一个数据为基准数据
        String baseStr = strs[0];
        // 从 i= 1 开始循环，依次和基准数据比较
        for (int i = 1; i < strs.length; i++) {
            String compareStr = strs[i];
            while (!compareStr.startsWith(baseStr)) {
                // 如果基准数据不是比较数据的前戳，则循环截取
                baseStr = baseStr.substring(0, baseStr.length() - 1);
                if (baseStr.length() == 0) {
                    return "";
                }
            }
        }
        return baseStr;
    }
}
