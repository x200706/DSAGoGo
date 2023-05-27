package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeDS {

    @Test
    public void test() {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return new ArrayList<>();
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
