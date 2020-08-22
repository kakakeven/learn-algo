package com.lintrip.tree;

import org.junit.Before;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree solution;

    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        solution = new MaximumDepthOfBinaryTree();
        treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(5);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(7);
    }

    @Test
    public void solution() {
        int depth = solution.solution(treeNode);
        System.out.println(depth);
    }
}