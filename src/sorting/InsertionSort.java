package sorting;

/*
Best Case -- O(n)
Worst Case/ Avg Case -- O(n^2)
 */
public class InsertionSort {
    public void insertionSort(int[] arr){
        int arrLen = arr.length;
        for(int i = 0; i<= arrLen -1; i++){
            int j = i;
            while ( j > 0 && arr[j -1 ] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After selection sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr ={12, 46,24, 52, 20, 9};
        insertionSort.insertionSort(arr);
    }
}
