package com.lintrip.tree;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class MaximumDepthOfBinaryTree {

    public int solution(TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
        int leftDepth = solution(treeNode.left);
        int rightDepth = solution(treeNode.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
