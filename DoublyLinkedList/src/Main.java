public class Main
{
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add("Hello");
        dll.add("World");
        dll.add("Java");
        dll.addFirst("Start");
        dll.addAt(2, "There");

        dll.displayForward();  // Start Hello There World Java
        dll.displayBackward(); // Java World There Hello Start

        System.out.println("Removed: " + dll.removeAt(2)); // There
        dll.displayForward();  // Start Hello World Java

        System.out.println("Contains 'Java': " + dll.contains("Java")); // true
        System.out.println("Size of list: " + dll.size()); // 4
    }
}
