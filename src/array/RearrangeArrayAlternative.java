package array;

import java.util.ArrayList;
import java.util.Collections;

public class RearrangeArrayAlternative {

    /* Time complexity
    --------------------
    O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and
    another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.

    Space Complexity
    ---------------------
    O(N/2 + N/2) == O(N) // negative and positive array list with N/2 elements
    */
    public static int[] rearrangeArrayBrute(int[] arr){
        ArrayList<Integer> positiveArray = new ArrayList<>();
        ArrayList<Integer> negativeArray = new ArrayList<>();
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]>0){
                positiveArray.add(arr[i]);
            }else{
                negativeArray.add(arr[i]);
            }
        }
        //Rearrange and put back
        for(int i =0; i<arr.length/2; i++){
            arr[2*i] = positiveArray.get(i);
            arr[2*i+1] = negativeArray.get(i);
        }
        return arr;
    }


    /* Time complexity
    --------------------
    O(N) { O(N) for traversing the array once }.

    Space Complexity
    ---------------------
    O(N) - 1 extra space used with N element
    */
    public static ArrayList<Integer> rearrangeArrayOptimal(int[] arr){
        ArrayList<Integer> resultArray = new ArrayList<>(Collections.nCopies(arr.length, 0));
        int posElement = 0;
        int negElement= 1;

        //ArrayList<Integer> negativeArray = new ArrayList<>();
        for(int i =0; i< arr.length ; i++){
            if(arr[i]>0){
                resultArray.set(posElement,arr[i]);
                posElement +=2;
            }else{
                resultArray.set(negElement,arr[i]);
                negElement +=2;
            }
        }
        return resultArray;
    }


    public static void main(String[] args) {
        int[] array = {1,2,-4,-5};
        //int[] retArr= RearrangeArrayAlternative.rearrangeArrayBrute(array);
        ArrayList<Integer> retArr= RearrangeArrayAlternative.rearrangeArrayOptimal(array);
        for(int ret : retArr){
            System.out.print(ret+" ");
        }
    }
}
