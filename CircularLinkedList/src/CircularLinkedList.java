public class CircularLinkedList {
    private Node head;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Adds a new node with the specified data at the end of the list
    public void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.setLink(head); // Points to itself, maintaining circular nature
        } else {
            Node temp = head;
            while (temp.getLink() != head) {
                temp = temp.getLink();
            }
            temp.setLink(newNode);
            newNode.setLink(head); // Maintains circular nature
        }
        size++;
    }

    // Deletes the first occurrence of the specified data
    public void delete(Object data) {
        if (head == null) return;

        Node current = head;
        Node previous = null;
        do {
            if (current.getData().equals(data)) {
                if (previous == null) { // delete head
                    if (head.getLink() == head) { // only one element
                        head = null;
                    } else {
                        Node last = head;
                        while (last.getLink() != head) {
                            last = last.getLink();
                        }
                        head = head.getLink();
                        last.setLink(head);
                    }
                } else {
                    previous.setLink(current.getLink());
                }
                size--;
                return;
            }
            previous = current;
            current = current.getLink();
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
            System.out.print(temp.getData() + " ");
            temp = temp.getLink();
        } while (temp != head);
        System.out.println();
    }
}