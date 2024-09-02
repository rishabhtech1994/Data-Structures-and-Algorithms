package stack;

import java.util.Stack;

public class NextGreaterElementStack {

    public static int[] nextGreaterElements(int[] arr){
        int arrLen = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arrLen];
        for(int i = arrLen-1 ; i >= 0; i--){
            // race condition when we need to pop the element
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            // cond when stack becomes empty add -1 else add the top element of arr
            if(stack.isEmpty()) {
                nge[i] = -1;
            }
            else{
                nge[i] = stack.peek();
            }
            // Push to teh stack once done
            stack.push(arr[i]);
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
