package search;

public class LowerUpperBound {

    public static int lowerBoundNoBrute(int[] arr, int targetBound) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= targetBound) {
                return i;
            }
        }
        return 0;
    }

    // n >= targetBound
    /*
        Time Complexity
        ----------------
        Worst Case== O(log (base 2) N)
     */
    public static int lowerBoundNoOptimal(int[] arr, int targetBound) {
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen - 1;
        int lb = arrLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= targetBound) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lb;
    }


    // n >= targetBound
    /*
        Time Complexity
        ----------------
        Worst Case== O(log (base 2) N)
     */
    public static int upperBoundNoOptimal(int[] arr, int targetBound) {
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen - 1;
        int ub = arrLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            //n >= targetBound   ==> Only change in upper bound
            if (arr[mid] > targetBound) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ub;
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        //int returnPos = LowerUpperBound.lowerBoundNoOptimal(arr, 4);
        int returnPos = LowerUpperBound.upperBoundNoOptimal(arr, -1);
        System.out.println("Pos " + returnPos);
    }
}
