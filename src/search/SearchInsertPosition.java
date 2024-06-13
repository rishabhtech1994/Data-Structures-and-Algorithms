package search;

public class SearchInsertPosition {

    public static int searchOInsertPos(int[] arr, int target){
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen - 1;
        int lb = arrLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        //int returnPos = LowerUpperBound.lowerBoundNoOptimal(arr, 4);
        int returnPos = SearchInsertPosition.searchOInsertPos(arr, 2);
        System.out.println("Pos " + returnPos);
    }
}
