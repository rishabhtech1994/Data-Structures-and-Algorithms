package array;

/*

Optimum Solution
-------------------
Worst case == O(n)

Brute force
------------
Worst Case == O(n^2)  == for 2 loops

 */

public class IsSortedArray {
    public static boolean isArraySorted(int[] arr){
        boolean isSorted = false;
        for(int i =0 ; i< arr.length -1 ; i++){
            if (arr[i] < arr[i + 1]) {
                isSorted = true;
            }else {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static boolean bruteForceSolution(int[] arr){
        boolean isSorted = false;
        for(int i = 0 ; i< arr.length -1; i++){
            for(int j = i+1; j< arr.length -1; j++){
                if(arr[i]< arr[j]){
                    isSorted = true;
                }else {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int[] arr = {24,25,30,5,1,9};
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean isSorted = isArraySorted(arr);
        //boolean isSortedBF = bruteForceSolution(arr);
        System.out.println("Array is sorted " +isSorted);
        //System.out.println("Array is sorted " +isSortedBF);
    }
}
