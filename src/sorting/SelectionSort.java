package sorting;

/*
Worst Case/ Avg Case /Best case -- O(n^2)
 */
public class SelectionSort {

    public void selectionSort(int[] arr){
        int arrLen = arr.length;
        for(int i =0; i < arrLen -1 ; i++){
            int min = i;
            for(int j =i+1 ; j < arrLen; j++){
                //find min logic
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //Swap
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr ={12, 46,24, 52, 20, 9};
        selectionSort.selectionSort(arr);
    }
}
