package tree;

import com.sun.source.tree.Tree;

import java.util.*;


class Pair{
    TreeNode node;
    int col;

    public Pair(TreeNode node, int col){
        this.node = node;
        this.col = col;
    }
}

public class BottomView {
    public ArrayList<Integer> bottomView(TreeNode root)
    {
        ArrayList<Integer> listNode = new ArrayList<>();
        if(root == null){
            return listNode;
        }

        //Queue<Pair> queuePair = new LinkedList<>();
        Queue<Pair> queue = new LinkedList<>();
        // Tree Map for proper sorted Map
        // Integer  == Col Integer == Node.val
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){
            Pair pairData = queue.poll();
            TreeNode node = pairData.node;
            int col = pairData.col;

            // Not required to check as the treeMap value should be updfated with teh bottom view
            treeMap.put(col, node.val);

            if(node.left != null){
                queue.add(new Pair(node.left, col -1));
            }
            if(node.right != null){
                queue.add(new Pair(node.right, col+1));
            }

        }


        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            listNode.add(entry.getValue());
        }

        return listNode;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(11);
        root.right.left = new TreeNode(9);

        BottomView solution = new BottomView();

        // Get the Bottom View traversal
        ArrayList<Integer> bottomView = solution.bottomView(root);

        // Print the result
        System.out.println("Bottom View Traversal: ");
        for(int node : bottomView) {
            System.out.print(node + " ");
        }
    }
}
