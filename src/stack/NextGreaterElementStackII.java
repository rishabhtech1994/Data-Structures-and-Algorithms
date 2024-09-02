package stack;

import java.util.Stack;

public class NextGreaterElementStackII {
    public static int[] nextGreaterElements(int[] arr){
        // TC : O(4N)
        // SC : O(2N)
        int arrLen = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arrLen];
        // We hypotically increase the array by 2 times to make sure the circular nature is retained of an array
        for(int i = 2* arrLen -1 ; i>= 0 ; i--){
            // race condition when we need to pop the element
            // O(2N)
            while(!stack.isEmpty() && stack.peek() <= arr[i%arrLen]){
                stack.pop();
            }
            // We only Greater element for this cond
            // Rest of the array is not considered
            if(i< arrLen){
                nge[i] = stack.isEmpty() ? -1:stack.peek();
            }
            // O(2N)
            // For maintaining the circular array traversal
            // Remember as we implement Circular Queue.
            stack.push(arr[i%arrLen]);
        }
        return nge;
    }



    public static void main(String[] args) {
        int[] arr={5,7,1,2,6,0};
        int[] arr2 = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
