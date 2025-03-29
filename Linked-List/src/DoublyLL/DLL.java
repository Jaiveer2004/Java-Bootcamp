package DoublyLL;

import SinglyLL.LL;

public class DLL {

    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    // ----------------------------- * Methods * -------------------------------------

    // To print DLL:
    public void printDLL() {
        DLL.Node current = head;
        DLL.Node tail = null;

        while(current != null) {
            if(current.next == null) {
                System.out.print(current.data + " -> NULL");
            } else {
                System.out.print(current.data + " -> ");
            }
            current = current.next;
            tail = current;
        }
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println();
    }

    // To insert at Start:
    public void insertAtStart(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }

        head = node;

        size += 1;
    }

    // // For inserting at end:
    // public void insertAtEnd(int val) {
    //     Node node = new Node(val);
    //
    //     if(head == null) {
    //         head = node;
    //         head
    //     }
    // }

    // Reversal of a DLL (using tail):
    public void reverseDLL() {
        // Print in reverse order
        Node tail = head;

        while(tail.next != null) {
            tail = tail.next;
        }

        // Now tail points to the last node
        while(tail != null) {
            System.out.print(tail.data + " -> ");
            tail = tail.prev;
        }
        System.out.println("NULL");

    }


    // ------------------------- * Node Class * -----------------------------------------
    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

}
