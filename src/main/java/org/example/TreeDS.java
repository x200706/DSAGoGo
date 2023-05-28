package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeDS {

    @Test
    public void inorderTraversalTest() {
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

        System.out.println(inorderTraversal(node1));

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> targetList = new ArrayList<>();
        recursion(root, targetList);
        return targetList;
    }

    //以遞迴遍歷吧 結果會從最深處add
    public void recursion(TreeNode root, List<Integer> targetList) {
        //此題的邊際：空的樹，先return掉
        if (root == null) {
            return;
        }
        recursion(root.left,targetList);
        targetList.add(root.val);
        recursion(root.right,targetList);
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
