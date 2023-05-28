package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TreeDS2 {

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

        System.out.println(maxDepth(node1));

    }

    public int maxDepth(TreeNode root) {
        ArrayList<Integer> targetList = new ArrayList<>();
        int level = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return recursion(root, targetList, maxHeap,level);
    }

    //以遞迴遍歷吧 結果會從最深處add
    public int recursion(TreeNode root, List<Integer> targetList, PriorityQueue<Integer> maxHeap,int level) {
        if (root == null) {
            return level;
        }
        level++;
        maxHeap.add(level);
        recursion(root.left, targetList,maxHeap,level);
        targetList.add(root.val);
        recursion(root.right, targetList,maxHeap,level);
        return maxHeap.peek();
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
