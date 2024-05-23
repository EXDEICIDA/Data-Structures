public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // Method to add a node at the end of the list
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    // Method to remove a node by value
    public void remove(Object data) {
        if (head == null) {
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getLink();
            return;
        }

        Node current = head;
        while (current.getLink() != null && !current.getLink().getData().equals(data)) {
            current = current.getLink();
        }

        if (current.getLink() != null) {
            current.setLink(current.getLink().getLink());
        }
    }

    // Method to search for a node by value
    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getLink();
        }
        return false;
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getLink();
        }
        System.out.println("null");
    }

    // Method to get the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getLink();
        }
        return count;
    }
}
