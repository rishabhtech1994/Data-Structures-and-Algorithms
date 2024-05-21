package linkedlist;

public class Node {
    int data;
    linkedlist.Node next;

    Node(int data, linkedlist.Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

}
