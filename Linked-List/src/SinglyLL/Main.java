package SinglyLL;

public class Main {
    public static void main(String[] args) {
        // Create a new SinglyLL.LL:
        LL list = new LL();

        // Insert at first position:
        list.insertAtStart(3);

        // Insert at end position: Using tail
        list.insertAtEndTail(5);
        list.insertAtEndTail(20);
        list.insertAtEndTail(78);
        list.insertAtEndTail(106);

        // Insert at end without tail:
        list.insertAtEnd(6);

        // Before:
        list.printLL();

        // Insert at Given Position
        // int pos = 7;
        // int val = 96;
        // list.insertAtPos(val, pos);

        // Delete at first
        // System.out.println("Deleted values is: " + list.deleteAtFirst());

        // Delete at end
        // System.out.println("Deleted values is: " + list.deleteAtEnd());

        // Delete at given pos:
        // System.out.println("Deleted values is: " + list.deleteAtPos(3));

        // Print the SinglyLL.LL:
        list.printLL();
    }
}
