package array;

public class RotateArray {
    // Duplicate Array will take more space and hence the space complexity will increase O(N)

    /* Time Complexity
    ----------------------------
    Worst Case  == O(n)
    space Complexity == O(1)
     */
    public static int[] rotateLeft(int[] arr) {

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    /* Time Complexity of K elements
    ----------------------------
    Worst Case  == O(n+k)
    space Complexity == O(k)

    Always move the array with modular of N
    k = k % N // This will give the exact no of rotations to be done.

    Take temp[] and save the elements from left/right as per the rotations and save it to last/first respectively.
     */
    public static int[] rotateLeftByKElementsBrute(int[] arr, int k) {
        int arrLen = arr.length;
        // modular
        k = k % arrLen;
        int[] temp = new int[k];
        // Saving the k elements into temp O(k)
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // Move elements O(n-k)
        for (int i = 0; i < arrLen - k; i++) {
            arr[i] = arr[i + k];
        }
        // Move the temp to the last O(k)
        for (int i = arrLen - k; i < arrLen; i++) {
            arr[i] = temp[i - arrLen + k];
        }

        return arr;
    }

    /* Time Complexity of K elements Optimal solution
   ----------------------------
   Worst Case  == O(n+k)
   space Complexity == O(1) // Space complexity is reduced here as no temp array iss used
*/
    public static int[] rotateLeftByKElementsOptimal(int[] arr, int k) {
        int arrLen = arr.length;
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arrLen - 1);
        reverseArray(arr, 0, arrLen - 1);
        return arr;
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    /*********************** Right Shift *************************/

    public static int[] rotateRightByKElementsOptimal(int[] arr, int k) {
        int arrLen = arr.length;
        reverseArray(arr, 0, arrLen - k - 1);
        reverseArray(arr, arrLen - k, arrLen - 1);
        reverseArray(arr, 0, arrLen - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {24, 25, 30, 5, 1, 9, 4, 3};
        //int[] returnedArray = RotateArray.rotateLeft(arr);
        //int[] returnedArray = RotateArray.rotateLeftByKElementsBrute(arr, 3);
        //int[] returnedArray = RotateArray.rotateLeftByKElementsOptimal(arr, 2);
        int[] returnedArray = RotateArray.rotateRightByKElementsOptimal(arr, 2);
        for (int i : returnedArray) {
            System.out.print(i + " ");
        }
    }
}
