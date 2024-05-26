package array;
/*
Largest Element in array
Brute Force Approach
------------------------
Sort
Worst Case complexity : O(nlog n)

Better approach
-----------------------
Worst Case : O(2n)

Best Approach
------------------
Worst case : O(n)

 */

public class SecondLargestAndSmallest {

    public static int secondLargestElement(int[] arr){
        int largest = arr[0];
        int sLargest = -1;
        for(int i =1 ; i< arr.length ; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > sLargest ){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static int secondSmallestElement(int[] arr){
        int smallest = arr[0];
        int sSmall = Integer.MAX_VALUE;
        for(int i =1 ; i< arr.length ; i++){
            if(arr[i] < smallest){
                sSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < sSmall ){
                sSmall = arr[i];
            }
        }
        return sSmall;
    }

    public static void main(String[] args) {
        int[] arr = {24,25,30,5,1,9};
        //int secondLargestElement = SecondLargestAndSmallest.secondLargestElement(arr);
        int secondLSmallestElement =  SecondLargestAndSmallest.secondSmallestElement(arr);
        //System.out.println("The Largest Element is " +secondLargestElement);
        System.out.println("The Largest Element is " +secondLSmallestElement);
    }
}
