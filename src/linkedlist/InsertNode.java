package linkedlist;

import java.awt.*;

public class InsertNode {

    public static Node convertArrayToLL(int[] arr) {
        // add 1st element
        Node head = new Node(arr[0]);
        // use mover to move the LL in array
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            // Loop the array and add the Node
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }

    public static Node insertTail(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        // Iterate to last before NULL
        while (temp.next != null) {
            temp = temp.next;
        }
        // create node
        Node newNode = new Node(val);
        // assign the new Node to temp and end at the tail
        temp.next = newNode;
        return head;
    }

    // K is the position to insert
    public static Node insertK(Node head, int k, int element) {
        //O(N) =-- worst case
        //if the Node is nULL
        if (head == null) {
            if (k == 1) {
                return new Node(element, head);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(element, head);
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node newNode = new Node(element);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    // K is the position to insert
    public static Node insertBeforeElement(Node head, int element, int beforeValue) {
        //O(N) =-- worst case
        //if the Node is nULL
        if (head == null) {
            return null;
        }
        // Insert at first
        if(head.data == beforeValue){
            return new Node(element, head);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == beforeValue) {
                Node newNode = new Node(element);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8};
        Node head = convertArrayToLL(arr);
        //Node newHeadInsert = insertHead(head, 14);

        //Node newHeadInsert = insertTail(head, 0);

        //Node newInsertAtK = insertK(head, 5, 12);

        Node newInsert = insertBeforeElement(head, 12, 8);
        printLL(newInsert);
    }
}
