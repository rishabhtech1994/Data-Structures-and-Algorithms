package array;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    /*****************************Brute Force ******************************************************************
     /*
     Brute force approach
     Time complexity for BF
     -------------------------
     Worst case -- O(n^2) because there are two loops(i.e. nested) each running for approximately N times.
     Space - O(1) : No extra space
     */

    public static String twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (target == arr[i] + arr[j]) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static int[] twoSumBruteReturnIndices(int[] arr, int target) {
        int[] targetIndices = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (target == arr[i] + arr[j]) {
                    targetIndices[0] = i;
                    targetIndices[1] = j;
                    return targetIndices;
                }
            }
        }
        return targetIndices;
    }


    /***************************************** Better Approach (using Hashing)  Suggested approach ***********************************************/
    /*
       Better force approach
       Time complexity
       -------------------------
       Worst case -- O(n)
       Space - O(n)
     */
    public static String twoSumBetterApp(int[] arr, int target) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //2ndVar= target - 1stVar
            int secondSumVariable = target - arr[i];
            if (myHash.containsKey(secondSumVariable)) {
                return "YES";
            }
            myHash.put(arr[i], i);
        }
        return "NO";
    }

    public static int[] twoSumBetterAppReturnIndices(int[] arr, int target) {
        int[] targetIndices = {-1, -1};
        HashMap<Integer, Integer> myHash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int secondSumVariable = target - arr[i];
            if (myHash.containsKey(secondSumVariable)) {
                targetIndices[0] = myHash.get(secondSumVariable);
                targetIndices[1] = i;
                return targetIndices;
            }
            myHash.put(arr[i], i);
        }
        return targetIndices;
    }


    /***************************************** Optimal Approach (Two pointer)***********************************************/
    /*
       Optimal approach
       Time complexity
       -------------------------
       Worst case -- O(N) + O(N*logN), where N = size of the array.
       Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.
       Space - O(1)
     */
    public static String twoSumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static int[] twoSumOptimalReturnIndices(int[] arr, int target) {
        int[] targetIndices = {-1, -1};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                targetIndices[0]= left-1;
                targetIndices[1]= right-1;
                return targetIndices;
            } else if (sum < target) left++;
            else right--;
        }
        return targetIndices;
    }


    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
       /* String twoSumPoss = twoSumBrute(arr, 14);
        System.out.println(twoSumPoss);
        int[] targetIndices = twoSumBruteReturnIndices(arr, 14);*/

        /*String twoSumPossBA = twoSumBetterApp(arr, 15);
        System.out.println(twoSumPossBA);
        int[] targetIndices = twoSumBetterAppReturnIndices(arr, 15);*/

        String twoSumPossOpApp = twoSumOptimal(arr, 14);
        System.out.println(twoSumPossOpApp);
        int[] targetIndices1 = twoSumOptimalReturnIndices(arr, 14);

        for (int i : targetIndices1) {
            System.out.print(i + " ");
        }
    }
}
