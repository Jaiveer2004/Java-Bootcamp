package DoublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        // Adding at start:
        list.insertAtStart(10);
        list.insertAtStart(11);
        list.insertAtStart(12);

        // Adding at End:
        // list.insertAtEnd(11);

        // Print in reverse order:
        // list.reverseDLL();

        // Printing DLL:
        list.printDLL();
    }
}
