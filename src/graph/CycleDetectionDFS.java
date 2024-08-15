package graph;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;

public class CycleDetectionDFS {
    // Time Complexity: O(N + 2E) + O(N),
    // Space O(N) +O(N)
    boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> arr, int[] visitedArray){
        visitedArray[node] = 1;
        for(Integer it : arr.get(node)){
            if(visitedArray[it] ==0){
                //visitedArray[it] =1 ;
                if(dfs(it, node, arr, visitedArray)) return true;
            }else if(it != parent) {
                // This Cond is for the cycle as the current node is not equal to the previous parent
                return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int[] visitedArray = new int[V];
        for(int i =0; i<V ; i++){
            if(visitedArray[i] == 0){
                // For Connected components
                // Taking parent as -1 as it start from first node,
                if(dfs(i,-1, adj, visitedArray)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        CycleDetectionDFS obj = new CycleDetectionDFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

}
