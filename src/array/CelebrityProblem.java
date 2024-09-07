package array;

public class CelebrityProblem {
    // Brute Force Solution
    // TC == O(n^2)
    // SC == O(2N)

    /*public int celebrity(int[][] mat) {
        int n = mat.length;
        // Will take 2 inputs
        int[] knowingMeArray = new int[n];
        int[] iKnowArray = new int[n];

        for(int i =0; i< n-1 ; i++){
            for(int j =0; j <n-1 ; j++){
                if(mat[i][j] == 1){
                    knowingMeArray[j]++;
                    iKnowArray[i]++;
                }
            }
        }

        for(int i= 0 ; i< n-1; i++){
            if(knowingMeArray[i] == n-1 && iKnowArray[i] == 0){
                return i;
            }else{
                return  -1;
            }
        }

        return 0;
    }*/

    // Optimal Approach using top and down pointers for n

    // TC == O(2N)
    // SC == O(1)
    public int celebrity(int[][] mat) {
        int n = mat.length;
        int top =0;
        int down = n-1;
        while(top < down){
            if(mat[top][down] == 1){
                // The person can be treated as known we move ahaed
                top ++;
            }else if(mat[down][top] == 1){
                down --;
            }else{
                top --;
                down --;
            }
        }

        if(top > down) return -1;

        for(int i =0 ; i<n-1 ; i++){
            if(i == top) continue;
            // Check for row and colum if they are 0
            // if all are o that means we have the celebrity as top / down
            if(mat[top][i] == 0 && mat[i][top] == 1){
                return top;
            }else{
                return -1;
            }

        }
        return top;
    }


}
