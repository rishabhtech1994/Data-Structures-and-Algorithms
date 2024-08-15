package graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    int time;
    Pair(int row, int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
public class RottenOrangesGraph {
    public static int orangesRotting(int[][] grid) {
        // Solution used BFS
        // get the row and col of the grid given
        // row in input
        int m= grid.length;
        // col in input
        int n = grid[0].length;
        // Create a Qeue with LiinkedList and Pair Custom Object
        Queue<Pair> q = new LinkedList<>();
        //Create the visitedArray
        int[][] visitedArray = new int[n][m];
        // time
        //int time=0;
        // max Time
        int maxTime  = 0;
        //Fresh Orange Counter
        int cntFresh = 0;
        // Counter for counting no of changes and also matching with the cntFresh(Fresh oranges)
        // this will save one loop of traversal for the VA and getting the remaining Fresh orange
        int count =0;
        // Add element to the Queue and VA
        // Traverse the input grid
        for (int i =0 ; i< m ; i++){
            for(int j =0; j< n ;j++){
                // check for the rotten orange
                if(grid[i][j] == 2){
                    // Add to Queue and Fill the visited Array
                    q.add(new Pair(i, j, 0));
                    visitedArray[i][j] = 2;
                }else{
                    visitedArray[i][j] = 0;
                }
                // Calculate the fresh Orange Counter
                if(grid[i][j] == 1) cntFresh ++;
            }
        }

        // Calculate the Delta Row and column
        // For calculating the Drow and dcol, start from top and move anticlock wise with +1 0 and -1 for row and col
        int[] drow ={-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        // BFS traversal with queue
        // Move until q is empty
        while(!q.isEmpty()){
            // Decouple the first entry of the q
            // row col and time are var in Pair DS craeted above
            int row = q.peek().row;
            int col = q.peek().col;
            int t = q.peek().time;
            q.remove();

            // Calculate the Max time
            maxTime = Math.max(maxTime, t);

            // Calculation of the neighbours with the given roa and col for traversal
            // traversal is 4 bcoz each node can have 4 neighbours
            for(int i = 0 ; i<4 ; i++){
                // calculate the nrow and ncol
                // add the delta row with row to calculate the nrow
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                // check nrow and ncol are valid as per the grid and position
                // also check grid == 1 and VA != 2
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && visitedArray[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    //Add in queue
                    q.add(new Pair(nrow, ncol, t+1));
                    // edit nrow and ncol in  VA = 2
                    visitedArray[nrow][ncol] = 2;
                    count++;

                }
            }
        }
        // Check if all the fresh oranges are converted
        // if not then return -1
        if(count != cntFresh) return -1;
        // return max time
        return maxTime;
    }

    public static void main(String[] args) {
        int[][] arr={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = orangesRotting(arr);
        System.out.println("Minimum Number of Minutes Required "+rotting);
    }
}
