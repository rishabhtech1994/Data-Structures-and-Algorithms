package sorting;

import javax.swing.plaf.ButtonUI;
/*
Best Case -- O(n)
Worst Case/ Avg Case -- O(n^2)
 */
public class BubbleSort {
    public void bubbleSort(int[] arr){
        int arrLen = arr.length;
        int bestCasefind = 0;
        // i -- Iterate from the end
        // j -- should swap and go with the condition
        for(int i = arrLen -1 ; i >0 ; i--){
            for(int j =0 ; j <= i -1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    bestCasefind = 1;
                }
                System.out.println("bestcase");
            }
            // For best case scenario
/*            if(bestCasefind == 0){
                break;
            }*/
        }
        System.out.println("After bubble sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr ={12, 46,24, 52, 20, 9};
        //int[] arr ={2, 3, 4, 5, 6};
        bubbleSort.bubbleSort(arr);
    }
}
