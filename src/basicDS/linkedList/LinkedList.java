package basicDS.linkedList;

public class LinkedList {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
//        For empty LL
        if (head == null) {
            head = newNode;
            return;
        }
//        For LL with elements, head being first node we need to
//        reach till last node to insert from behind
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int key) {
        Node current = head, previous = null;
//        remove head node if it is equal to key
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
//        iterate till n-1 to store n-1 and n+1 element
//        where n is the index of matching element
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
//        for empty LL
        if (current == null) return;
//        delete the element at n
        previous.next = current.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
