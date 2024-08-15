package graph;

import java.beans.Visibility;
import java.util.ArrayList;

public class GraphTraversalDFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visitedArray = new boolean[V];
        visitedArray[0]= true;
        ArrayList<Integer> dfsList = new ArrayList<>();
        dfs(0, adj, visitedArray, dfsList);
        return dfsList;
    }

    public void dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean[] visitedArray, ArrayList<Integer> dfsList){
        visitedArray[V] = true;
        dfsList.add(V);
        for(Integer it: adj.get(V)){
            if(!visitedArray[it]){
                dfs(it, adj, visitedArray, dfsList);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        GraphTraversalDFS sl = new GraphTraversalDFS();
        ArrayList < Integer > ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
