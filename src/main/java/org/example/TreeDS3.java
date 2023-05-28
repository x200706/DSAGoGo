package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

public class TreeDS3 {

    @Test
    public void maxDepthTest() {
        //重點練習：二叉樹的資料儲存
        //步驟一：先創造所有節點吧
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        //步驟二：連接節點
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        invertTree(node1); //直接提交，這邊就沒有遍歷印出來
    }

    public TreeNode invertTree(TreeNode root) {
        //此題邊際：空的樹
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
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
