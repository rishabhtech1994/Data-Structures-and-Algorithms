package tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class BoundaryNodeCount {
    ArrayList<Integer> boundary(TreeNode node){
        ArrayList<Integer> res = new ArrayList<>();
        if(node == null){ return res;}

        if(isLeafNode(node)){
            res.add(node.val);
        }

        leftBoundary(node, res);
        addLeafNodes(node, res);
        rightBoundary(node, res);
        return res;
    }


    boolean isLeafNode(TreeNode node){
        return node.left == null && node.right == null;
    }

    void leftBoundary(TreeNode node, ArrayList<Integer> res){
        TreeNode currNode = node.left;
        while (currNode != null) {
            if(!isLeafNode(currNode)){
                res.add(currNode.val);
            }

            if(currNode.left != null){
                currNode = currNode.left;
            }else{
                currNode = currNode.right;
            }
        }
    }

    void addLeafNodes(TreeNode node, ArrayList<Integer> res){

        if(isLeafNode(node)){
            res.add(node.val);
            return;
        }

        if(node.left != null){
            addLeafNodes(node.left, res);
        }else{
            addLeafNodes(node.right, res);
        }

    }


    void rightBoundary(TreeNode node, ArrayList<Integer> res){
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        TreeNode currNode = node.right;
        while (currNode != null) {
            if(!isLeafNode(currNode)){
                tempList.add(currNode.val);
            }

            if(currNode.right != null){
                currNode = currNode.right;
            }else{
                currNode = currNode.left;
            }
        }
        // add temp at back of res
        for(int i = tempList.size() -1; i>= 0; --i){
            res.add(tempList.get(i));
        }
    }

    void printResult(ArrayList<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BoundaryNodeCount solution = new BoundaryNodeCount();

        // Get the boundary traversal
        ArrayList<Integer> result = solution.boundary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        solution.printResult(result);
    }
}
