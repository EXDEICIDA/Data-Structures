public class CircularDoublyLinkedList {
    private static class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private int size;

    public CircularDoublyLinkedList() {
        head = null;
        size = 0;
    }

    // Inserts a new node with the specified data at the end of the list
    public void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
        }
        size++;
    }

    // Deletes the first occurrence of the specified data
    public void delete(Object data) {
        if (head == null) return;

        Node current = head;
        do {
            if (current.data.equals(data)) {
                if (current == head) { // If head is to be deleted
                    if (head.next == head) { // Only one element
                        head = null;
                    } else {
                        head.prev.next = head.next;
                        head.next.prev = head.prev;
                        head = head.next;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        } while (current != head);
    }

    // Returns the size of the list
    public int size() {
        return size;
    }

    // Utility method to print all elements in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
