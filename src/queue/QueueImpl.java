package queue;

public class QueueImpl {
    int count;
    int front;
    int rear;
    int maxSize = Integer.MAX_VALUE;
    int [] arr ;
    // Constructor with Max Size of the array
    public QueueImpl(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear =0;
        count =0;
    }

    // TC == O(1)
    public void push(int x){
        if(count == maxSize) return;
        arr[rear % maxSize] = x;
        rear++;
        count ++;
    }

    // TC == O(1)
    public int pop(){
        if(count == 0) return -1;
        int x =  arr[front % maxSize] ;
        front ++;
        count --;
        return x;
    }

    // TC O(1)
    public int top(){
        if(count == 0) return -1;
        return arr[front % maxSize];
    }

    // TC == O(1)
    public int size(){
        return count;
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
