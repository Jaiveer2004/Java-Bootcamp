package Questions;

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

    // ------------------------- * Questions * -----------------------------------------

    // Question 1: Remove duplicates from Sorted LL.
    public void removeDuplicates() {
        if(head == null || head.next == null) {
            return;
        }

        Node curr = head;

        while(curr.next != null) {
            if(curr.next.data == curr.data) {
                curr.next = curr.next.next;
                size--;
            } else {
                curr = curr.next;
            }
        }
    }

    // Question 2: Merge two Sorted Lists:
    public LL merge(LL list1, LL list2) {
        Node first = list1.head;
        Node second = list2.head;

        LL ans = new LL();

        while(first != null && second != null) {
            if(first.data <= second.data) {
                ans.insertAtEnd(first.data);
                first = first.next;
            } else {
                ans.insertAtEnd(second.data);
                second = second.next;
            }
        }

        while(first != null) {
            ans.insertAtEnd(first.data);
            first = first.next;
        }

        while(second != null) {
            ans.insertAtEnd(second.data);
            second = second.next;
        }

        return ans;
    }

    // Question 2: Check if a cycle exists in LL
    public boolean checkCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Question 3: Find the length of LL:
    public int calculateLen() {
        Node slow = head;
        Node fast = head;

        while(fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                Node temp = slow;
                int len = 0;

                do {
                    temp = temp.next;
                    len++;
                } while(temp != slow);

                return len;
            }
        }

        return 0;
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