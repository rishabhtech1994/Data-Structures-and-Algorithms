package search;

/*
Time Complexity
----------------
Worst Case/ Avg Case -- O(log (base 2) N)
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                return mid+1;
            }else if(target < arr[mid]){
                // Not requires this can increase the time
                //low = 0;
                high = mid - 1;
            }else {
                low = mid +1;
                // Not requires this can increase the time
                //high = arrLen -1;
            }
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr,int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (target == arr[mid]) {
            return mid + 1;
        } else if (target < arr[mid]) {
            return binarySearchRec(arr, low, mid - 1, target);
        } else {
            return binarySearchRec(arr, mid +1, high, target);
        }
    }

    public static int binarySearchRecMain(int[] arr,int target){
        return binarySearchRec(arr, 0, arr.length-1 , target);
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int returnedPosition= BinarySearch.binarySearch(arr, 9);
        //int returnedPosition= BinarySearch.binarySearchRecMain(arr, 9);
        if(returnedPosition > 0){
            System.out.print("Element found at pos "+returnedPosition);
        }else {
            System.out.print("Element not found ");
        }

    }
}
