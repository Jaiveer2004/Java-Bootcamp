package CircularLL;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void displayCLL() {
        Node curr = head;

        if(head != null) {
            do {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            } while (curr != head);

            System.out.println("HEAD");
        }
    }

    public void insert(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
