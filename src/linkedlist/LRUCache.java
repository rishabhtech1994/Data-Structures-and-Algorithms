package linkedlist;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListNode{
    int key, value;
    ListNode next, prev;
    ListNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}
public class LRUCache {
    int capacity;
    ListNode head = new ListNode(0, 0);
    ListNode tail = new ListNode(0, 0);
    // Create a map for storing the key aand Node
    Map<Integer, ListNode> map = new HashMap<>();

    public LRUCache(int capacity) {
        // get the capacity of the LRU
        this.capacity = capacity;
        // Clear the map in the begg
        map.clear();
        // Connect Head with tail
        head.next = tail;
        tail.prev = head;
    }

    public void deleteLRU(ListNode node){
        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void insertAfterHead(ListNode node){
        ListNode currentNode = head.next;
        node.next = currentNode;
        node.prev = head;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return  -1;
        }
        ListNode node = map.get(key);
        deleteLRU(node);
        insertAfterHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            node.value = value;
            deleteLRU(node);
            insertAfterHead(node);
        }else{
            // Check the capacity while inserting and if the cap is equal to size of mapp
            // We need to delete the LRU Node and insert the node at begg
            if(map.size() == capacity) {
                // find the LRU
                ListNode lRUNode = tail.prev;
                deleteLRU(lRUNode);
            }
            ListNode newNode = new ListNode(key, value);
            // Insert in map
            map.put(key, newNode);
            // Insert after head in DLL
            insertAfterHead(newNode);
            }
        }
    }