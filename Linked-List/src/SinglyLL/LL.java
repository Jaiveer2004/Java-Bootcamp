package SinglyLL;

public class LL {

    // Head: Stores the starting point of the SinglyLL.LL
    private Node head;

    // tail: Stores the ending point of the SinglyLL.LL
    private Node tail;

    // size: Stores the size of the SinglyLL.LL
    private int size;

    // Constructor to make a new SinglyLL.LL
    public LL() {
        this.size = 0;
    }

    // ----------------------------- * Methods * -------------------------------------

    // Print Function:
    public void printLL() {
        Node current = head;
        while(current != null) {
            if(current.next == null) {
                System.out.print(current.data + " -> NULL");
            } else {
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println();
    }

    // -- Getter Function for Node Reference --

    public Node get(int index) {
        Node curr = head;

        for(int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr;
    }

    public Node find(int value) {
        Node curr = head;

        while(curr != null) {
            if(curr.data == value) {
                return curr;
            }

            curr = curr.next;
        }

        return null;
    }

    // Inserting at first position
    public void insertAtStart(int val) {
        // Step 1: Create a new node
        Node node = new Node(val);

        // Step 2: Store the next of the node as head
        node.next = head;

        // Step 3: Store the head as this new node
        head = node;

        // Step 4: Check if it's the first node, then point the tail to head
        if(tail == null) {
            // No nodes exist, add as first node
            tail = head;
        }

        // Increase the size by one when a new node is added
        size += 1;

    }

    // Insert at Last (Using Tail):
    public void insertAtEndTail(int val) {
        // Step 1: Create a new Node:
        Node node = new Node(val);

        // Step 2: Check if this is first node?
        if(tail == null) {
            head = node;
            tail = head;
            return;
        } else {
            tail.next = node;
            tail = node;
        }

        // Step 3: Increase the size by one
        size += 1;
    }

    // Insert at end: Without tail
    public void insertAtEnd(int val) {
        // Check if no nodes exists : Then add the first node
        if(head == null) {
            Node node = new Node(val);
            head = node;
            return;
        }

        // Create a current(temp), that will traverse through the list
        Node curr = head;

        // Traverse through the list using the curr
        while(curr.next != null) {
            curr = curr.next;
        }

        // Now, curr is at last node
        // Add a new node here:
        Node node = new Node(val);
        curr.next = node;

        size += 1;
    }

    // Insert at given Position (with tail):
    public void insertAtPos(int val, int pos) {

        if(pos < 1 || pos > size + 1) {
            System.out.println("Position out of bounds");
            return;
        }

        if(pos == 1) {
            insertAtStart(val);
            return;
        }

        if(pos == size + 1) {
            insertAtEnd(val);
            return;
        }

        Node node = new Node(val);
        Node curr = head;

        for(int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }

        node.next = curr.next;
        curr.next = node;

        size += 1;
    }

    // Deletion at First:
    public int deleteAtFirst() {
        int val = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    // Delete at last (without tail)
    public int deleteAtEnd() {

        if(head.next == null) {
            int val = head.data;
            head = null;
            size -= 1;
            return val;
        }

        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }

        int val = curr.next.data;
        curr.next = null;
        tail = curr;

        size -= 1;

        return val;
    }

    // Delete at any position:
    public int deleteAtPos(int pos) {
        if(pos < 1 || pos > size) {
            System.out.println("Invalid Position.");
            return -1;
        }

        if(pos == 1) {
            return deleteAtFirst();
        }

        if(pos == size) {
            return deleteAtEnd();
        }

        Node curr = head;
        for(int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }

        int val = curr.next.data;
        curr.next = curr.next.next;

        size -= 1;

        return val;
    }

    // ------------------------- * Node Class * -----------------------------------------

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}