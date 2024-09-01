package stack;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}


public class StackUsingLL {
    ListNode top = null;
    int size=0;
    public void stackPushLL(int x){
        // Add the List Node
        ListNode temp  = new ListNode(x);
        // Move top to temp next
        temp.next = top;
        // move temp to top
        top = temp;
        size = size +1;
    }

    public int stackPopLL(){
        ListNode temp = top;
        int tempData = temp.data;
        // increase the top pos
        top = top.next;
        size = size -1;
        return tempData;
    }


    public int stackSize(){
        return  size;
    }

    public void printStackLL(){
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLL s = new StackUsingLL();
        s.stackPushLL(10);
        s.stackPushLL(20);
        s.printStackLL();
        System.out.println("Element popped " + s.stackPopLL());
        System.out.println("Stack size: " + s.stackSize());
    }
}
