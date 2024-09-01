package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    int size = 0;
    public void push(int x){
        // add to Queue
        q1.add(x);
        size ++;
        // Reverse Queue Element from top to last
        for(int i =0; i< q1.size()-1 ; i++){
            q1.add(q1.peek());
            q1.remove();
        }
    }

    public int peek(){
        return q1.peek();
    }

    public int pop(){
        size --;
        return q1.remove();

    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.peek());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.peek());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
