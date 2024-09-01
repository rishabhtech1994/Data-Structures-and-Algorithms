package queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack< Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int size  =0;
    /***
     * Following the optimal approach for the Queue using Stack
     * @param x : Input Params (data)
     * push: Just add to the Stack
     *       2 stacks are taken in this approach
     *
     * TC: O(N)
     */
    public void push(int x){
        // This push is the in-build function of stack as we are allowed to use stack and implement Queue
        s1.push(x);
        size ++;
    }

    /****
     *
     * Intution: Check for the 2nd Stack; if s2 is not empty; just pop() (STACK in-build function)
     *           If S2 is Empty --> loop through the s1 and Add in S2 and then pop
     *
     */
    public int pop(){
        int poppedElement =0;
        if(!s2.isEmpty()){
            size --;
            return s2.pop();

        }else{
            // Loop
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
            poppedElement =s2.pop();
            size --;
        }
        return poppedElement;
    }

    // Return the first Element

    /****
     *
     * Intution: Check for the 2nd Stack; if s2 is not empty; just return peek() (STACK in-build function)
     *                 If S2 is Empty --> loop through the s1 and Add in S2 and then return peek()
     * @return top most element / First Element
     */
    public int peek(){
        int topElement =0;
        if(!s2.isEmpty()){
            return s2.peek();
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
            topElement = s2.peek();
        }
        return topElement;
    }

    public int size(){
        return size;
    }



    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}
