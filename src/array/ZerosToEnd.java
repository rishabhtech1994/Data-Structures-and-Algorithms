package array;

import java.util.ArrayList;

public class ZerosToEnd {

    /*Brute force approach
       Time complexity for BF
       -------------------------
       Worst case -- O(2n)
       Space - O(n)
     */


    public static int[] zeroToEnd(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        //O(n)
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        //O(x)
        for(int i =0; i< temp.size(); i++){
            arr[i] = temp.get(i);
        }
        //O(n-x)
        for(int i = temp.size() ; i< arr.length; i++){
            arr[i] = 0;
        }

        return arr;
    }


    /*Optimal  approach
      Time complexity for OA
      -------------------------
      Worst case -- O(n)
      Space - O(1)
    */
    public static int[] zeroToEndOptimal(int[] arr){
        int j =-1;
        // get the position of j i.e. the first 0
        //O(x)
        for(int i = 0; i<arr.length; i++){
            if(arr[i] ==0){
                j = i;
                break;
            }
        }

        if (j == -1) return arr;
        //O(n-x)
        // iterate from j+1
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                // Increment j
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {24, 0, 0, 5, 1, 0, 4, 3};
        //int[] moveZeroList = zeroToEnd(arr);
        int[] moveZeroList = zeroToEndOptimal(arr);
        for (int i : moveZeroList){
            System.out.print(i+" ");
        }

    }
}
