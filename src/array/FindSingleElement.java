package array;

public class FindSingleElement {
/*
Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Brute
-----------
Time -- O(n^2)
Space  -- O(1)

Optimal
-----------
Time -- O(n)
Space  -- O(1)

 */
    static int getSingleElementOptimal(int[] nums){
        int n = nums.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }

    static int getSingleElementBrute(int[] nums){
        int n = nums.length;
        for( int i = 0; i<n ; i++){
            int num = nums[i];
            int count =0;

            for(int j =0; j<n; j++){
                if(num == nums[j]){
                    count ++;
                }
            }

            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2,4,3};
        int ans = getSingleElementBrute(arr);
        System.out.println("The single element is: " + ans);
    }
}
