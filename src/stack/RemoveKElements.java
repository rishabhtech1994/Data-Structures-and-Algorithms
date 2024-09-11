package stack;

import java.util.Stack;

public class RemoveKElements {
    public String removeKdigits(String num, int k) {
        // Convert String to Char Array
        char[] charSt = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i< charSt.length -1; i++){
            // Step 1 pop Condition from Stack
            // 3 condition -- stack not empty k> 0 stack.top > num[i]
            while(!stack.isEmpty() && k> 0 && ((stack.peek()-'0') > (charSt[i]-'0'))){
                stack.pop();
                k --;
            }
            // Push stack
            stack.push(charSt[i]);
        }
        // Step 2 if k doesnt reach 0
        // pop until k is zero we need to get the k digits removed
        while(k>0){
            stack.pop();
            k--;
        }

        // Step3: Check for Stack empty Condtionm
        if(stack.isEmpty()) return "0";

        // Step4: Traverse from the Stacvka md save in string
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.peek());
            stack.pop();
        }

        // remove the last zeros
        while((!result.isEmpty()) && result.charAt(result.length() - 1) == '0'){
            removeTrailingZeros(result.toString());
        }
        // Reverse the stack value in staring after deleting zeros
        //this is the result
        result = new StringBuilder(reverseString(result.toString()));
        if(result.isEmpty()) return "0";
        return result.toString();
    }

    public String reverseString(String str) {
        String res="";
        if (str == null || str.isEmpty()) {
            return str;
        }

        int i = str.length() - 1;
        while (i >= 0) {
            res = res+str.charAt(i);
            i--;
        }

        return res;
    }

    public String removeTrailingZeros(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == '0') {
            i--;
        }

        return str.substring(0, i + 1);
    }

    public static void main(String[] args) {
        RemoveKElements removeKElements = new RemoveKElements();
        String returned = removeKElements.removeKdigits("1432219", 3);
        System.out.println("Returned Element "+returned);
    }
}
