package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queueNode = new LinkedList<TreeNode>();
        List<List<Integer>> listNode = new ArrayList<>();
        boolean leftToRight = true;
        if (root == null) {
            return listNode;
        }

        queueNode.add(root);

        while (!queueNode.isEmpty()) {
            int size1 = queueNode.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size1 ; i++) {
                // Get the first Element
                TreeNode node = queueNode.poll();
                // index for entering the ArrayList
                // if leftToRight == true // Index == from leftToRight else from back size-1-i
                // int index;// = leftToRight ? i : (size - 1 - i);
                int index = leftToRight ? i : (size1 - 1 - i);
                System.out.println("index  --> "+index);
                System.out.println("node val  --> "+node.val);
                // Insert the node's value at
                // the determined index
                //assert node != null;
                row.add(index, node.val);

                if (node.left != null) {
                    queueNode.add(node.left);
                }
                if (node.right != null) {
                    queueNode.add(node.right);
                }
            }

            leftToRight = !leftToRight;
            listNode.add(row);
        }
        return listNode;

    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ZigZagTree solution = new ZigZagTree();

        // Get the zigzag level order traversal
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print the result
        printResult(result);
    }

    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
