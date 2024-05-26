package linkedlist.doublylinkedlist;

public class ArrayToDLL {

    public static Node convertToDll(int[] arr){
        Node head= new Node(arr[0]);
        Node prev = head;
        for(int i =1 ; i< arr.length ; i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void printDll(Node head){
        while (head !=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,5,6,7,8,7,6,8,9,5,8};
        Node head= convertToDll(arr);
        printDll(head);
    }
}
