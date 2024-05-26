package linkedlist.doublylinkedlist;

public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        prev = null;
    }
}
