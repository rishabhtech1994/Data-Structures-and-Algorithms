package search;

public class FloorCeilSortedArray {

    public static int findCeil(int[] arr, int target) {
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen - 1;
        int ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //Ceil
            if (arr[mid] >= target) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }

    public static int findFloor(int[] arr, int target) {
        int arrLen = arr.length;
        int low = 0;
        int high = arrLen - 1;
        int floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //Floor
            if (arr[mid] <= target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int[] getFloorAndCeil(int[] arr, int x) {
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);
        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int[] flce = FloorCeilSortedArray.getFloorAndCeil(arr, 9);
        System.out.println("Floor " + flce[0]);
        System.out.println("Ceil " + flce[1]);
    }
}
