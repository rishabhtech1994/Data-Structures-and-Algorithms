package linkedlist;

public class DeleteNode {

    public static Node convertArrayToLL(int[] arr){
        // add 1st element
        Node head = new Node(arr[0]);
        // use mover to move the LL in array
        Node mover = head;
        for(int i = 1; i< arr.length; i++){
            // Loop the array and add the Node
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static Node deleteHead(Node head){
        if (head == null) return head;
        //Node temp = head;
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head){
        if (head == null || head.next == null) return head;
        Node temp = head;
        // get to the 2nd last Node
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    // k is the position for deleting
    public static Node deleteK(Node head, int k){
        if (head == null) return head;

        if(k == 1){
            // Remove Head
            head = head.next;
            return head;
        }
        // count for traversing and find k
        int count =0;
        Node temp = head;
        Node prev = null;
        while(temp!= null){
            count ++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // el is the value of element for deletion
    public static Node deleteElement(Node head, int el){
        if (head == null) return head;

        if(el == head.data){
            // Remove Head
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!= null){
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,6,7,8};
        Node head= convertArrayToLL(arr);
        // Node newHead =deleteHead(head);
        //System.out.println("New Head --->"+newHead.data);
        // Node newTail = deleteTail(head);
        // printLL(newTail);
        //Node newNode = deleteK(head, 7);
        //printLL(newNode);

        Node newNode = deleteElement(head, 10);
        printLL(newNode);


    }
}
