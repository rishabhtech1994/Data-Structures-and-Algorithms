package array;

public class SetMatrixZero {
/*
Time Complexity
----------------
O(2*(n*m))

Space Complexity --- O(1)

 */

    public int[][] setMatrixZeroOptimal(int[][] matrix){
       // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        // mark the outside row and col( the outer layer in the optimal approach)
        int col1 = 1;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i< n ; i++  ){
            for(int j =0; j< m ; j++){
                if(matrix[i][j] == 0){
                   //mark the ith row
                    matrix[i][0] = 0;
                    if(j!= 0)
                        matrix[0][j] =0;
                    else
                        col1 = 0;
                }
            }
        }

        // iterate the inside matrix again for changing all the matrix
        // Dont change the outside layer of row and col in this iteration as they willbe used for
        // marking the inside array.

        for(int i =1; i<n; i++){
            for(int j =1 ; j<m ; j++){
                if(matrix[i][0]==0 ||  matrix[0][j]==0 ){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j =0 ; j<m ; j++){
                matrix[0][j]= 0;

            }
        }
        if (col1 == 0) {
            for(int i =0 ; i<n ; i++){
                matrix[i][0]= 0;
            }
        }
        return matrix;
    }



    public static void main(String[] args) {
        int[][] matrix =
                        {{1, 0, 3, 4},
                        {5, 0, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}};

        SetMatrixZero setMatrixZero = new SetMatrixZero();
        int[][] returnedMatrix= setMatrixZero.setMatrixZeroOptimal(matrix);
        printMatrix(returnedMatrix);

    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
