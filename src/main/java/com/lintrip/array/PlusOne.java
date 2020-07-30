package com.lintrip.array;

/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        // 标识是否产生了进位
        boolean carryBit = false;
        // 从低位开始计算
        for (int i = digits.length - 1; i > -1; i--) {
            int currentValue = digits[i];
            // 如果当前值为 9，则产生进位,当前位变为 0
            if (currentValue == 9) {
                carryBit = true;
                currentValue = 0;
            } else {
                carryBit = false;
                currentValue = digits[i] + 1;
            }
            digits[i] = currentValue;
            if (!carryBit) {
                break;
            }
        }
        // 如果执行完毕，还是有进位，则将高位置为 1
        if (carryBit) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
