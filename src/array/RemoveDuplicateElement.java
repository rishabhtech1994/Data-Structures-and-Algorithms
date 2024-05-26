package array;
/*


Brute force approach
-----------------------
Worst Case :

Best Approach
------------------
Worst case : O(n)

 */
public class RemoveDuplicateElement {

    public static int removeDuplicateBruteForce(int[] arr){


        return arr[0];
    }

    // return the array size with unique elements: Array being sorted
    public static int removeDuplicateOptimal(int[] arr){
        int i =0;
        for(int j = i+1; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                arr[i+1]=  arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,2,2,2,3,3,3,3,3, 4, 5,5,5,5,5,5,6, 6,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,9,10,10,10};
        int arraySize = RemoveDuplicateElement.removeDuplicateOptimal(arr);
        System.out.println("Size of the unique array "+arraySize);
    }
}
