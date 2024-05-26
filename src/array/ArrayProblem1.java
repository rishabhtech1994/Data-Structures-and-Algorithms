package array;

/*
Largest Element in array
Brute Force Approach
------------------------
Sort
Worst Case complexity : O(nlog n)

Recursive approach
-----------------------
Worst Case : O(n)
 */

import java.util.Arrays;

public class ArrayProblem1 {

    public static int largestElementBrutForce(int[]  array){
        //Array.sort uses modified version of quicksort called Timsort for primitive arrays.
        Arrays.sort(array);
        // return the last element
        return array[array.length - 1];
    }

    public static int largestElementRecursive(int[]  array){
        int max = array[0];
        for( int i = 0 ; i< array.length -1 ; i++){
            if(max < array[i+1]){
                max = array[i+1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {24,25,30,55,676,9};
        int largestElement = ArrayProblem1.largestElementRecursive(arr);
        System.out.println("The Largest Element is " +largestElement);
    }

}

