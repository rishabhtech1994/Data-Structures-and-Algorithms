package queue;

import java.util.List;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLL {
    ListNode start, end;
    int size =0;

    public void enqueue(int x){
        ListNode temp = new ListNode(x);
        if(start  == null){
            start = temp;
            end = temp;
        }else{
            end.next = temp;
            end = temp;
        }
        size ++;
    }

    public int dequeue(){
        if(start == null) return -1;
        ListNode temp = start;
        start= start.next;
        size --;
        return temp.data;
    }

    public int size(){
        return size;
    }

    public int peek(){
        if(start == null) return  -1;
        return start.data;
    }


    public static void main(String[] args) {
        QueueUsingLL q=new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("The pop of the Queue is "+q.dequeue());
        System.out.println("The pop of the Queue is"+q.dequeue());
        System.out.println("pop of the Queue is "+q.dequeue());
        System.out.println("The size of the Queue is "+q.size());
        System.out.println("The Peek element of the Queue is "+q.peek());
    }


}
