package linkedlist;

/*
Time complexity-- O(N) -- for traversal
 */
public class ArrayToLL {
    public static Node convertArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static int checkIfPresent(Node head, int valueForCheck){
        Node temp = head;
        while(temp != null){

            if(temp.data == valueForCheck)
                return 1;
            else {
                temp = temp.next;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr ={1,5,6,7,8,7,6,8,9,5,8,9,734,55,66};
        Node head= convertArrayToLL(arr);
        // Traversal
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;

        }

        // Length
        int lengthLL = lengthLL(head);
        System.out.println("Length of LL is ==" +lengthLL);

        //Check
        int check = checkIfPresent(head, 66);
        System.out.println("Check ----> " +check);


    }
}


