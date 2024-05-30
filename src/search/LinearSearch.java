package search;

import array.RotateArray;

public class LinearSearch {

    public static int linearSearch(int[] arr, int elementToBeSearched){
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] == elementToBeSearched){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {24,25,30,5,1,9};
        int returnedPosition= LinearSearch.linearSearch(arr, 9);
        System.out.println("Element found at pos " +returnedPosition);
    }
}
