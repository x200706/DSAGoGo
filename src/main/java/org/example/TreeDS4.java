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
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(4);

        //步驟二：連接節點
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        System.out.println(isSymmetric(node1));
    }

    public boolean isSymmetric(TreeNode root) {
        boolean flag = true;
        ArrayList<Integer> tree = new ArrayList<>();
        inorderTraversal(root, tree);
        ArrayList<Integer> reverseTree = new ArrayList<>();
        inorderTraversal(invertTree(root), reverseTree);

        for (int i = 0; i < tree.size(); i++) {
                if (tree.get(i) != reverseTree.get(i)) {
                    flag = false;
                    break;
                }
        }

        return flag;
    }

    //中序遍歷器
    public void inorderTraversal(TreeNode root, List<Integer> targetList) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, targetList);
        targetList.add(root.val);
        inorderTraversal(root.right, targetList);
    }

    //翻轉器
    public TreeNode invertTree(TreeNode root) {
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
