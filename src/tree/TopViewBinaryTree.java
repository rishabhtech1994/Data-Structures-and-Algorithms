package tree;

import java.util.*;


public class TopViewBinaryTree {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> listNode = new ArrayList<>();

        // Check if the tree is empty
        if (root == null) {
            return listNode;
        }

        // add your code
        //Queue<Pair<Node, Integer>> queue = new LinkedList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){

            Pair pair = queue.poll();
            TreeNode node = pair.node;
            int col = pair.col;
            // This is done for thr Top View as we dont want value to change if key is present in the Queue
            if (!map.containsKey(col)) {
                map.put(col, node.val);
            }

            if(node.left != null){
                queue.add(new Pair(node.left, col-1));
            }
            if(node.right!= null){
                queue.add(new Pair(node.right, col+1));
            }

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            listNode.add(entry.getValue());
        }

        return listNode;
    }
}
