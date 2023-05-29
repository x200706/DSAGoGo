package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TreeDS4 {

    @Test
    public void isSymmetricTest() {
        //重點練習：二叉樹的資料儲存
        //步驟一：先創造所有節點吧
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);

        //步驟二：連接節點
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node6;

        System.out.println(isSymmetric(node1));
    }

    public boolean isSymmetric(TreeNode root) {
        boolean flag = true;
        return flag;
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
