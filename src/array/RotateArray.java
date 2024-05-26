package array;

public class RotateArray {
    // Duplicate Array will take more space and hence the space complexity will increase O(N)


    /* Time Complexity

    Worst Case  == O(n)
    space Complexity == O(1)
     */
    public static int[] rotateLeft(int[] arr){

        int temp = arr[0];
        for(int i = 1 ; i< arr.length ;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {24,25,30,5,1,9};
        int[] returnedArray = RotateArray.rotateLeft(arr);
        for (int i: returnedArray) {
            System.out.print(i);
        }
    }
}
