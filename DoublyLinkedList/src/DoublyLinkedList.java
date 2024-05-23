public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addAt(int index, Object data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            add(data);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(data);
            newNode.setNext(current);
            newNode.setPrev(current.getPrev());
            current.getPrev().setNext(newNode);
            current.setPrev(newNode);
            size++;
        }
    }

    public Object removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node target = head;
        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }
        if (target == head) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
        } else if (target == tail) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            target.getPrev().setNext(target.getNext());
            target.getNext().setPrev(target.getPrev());
        }
        size--;
        return target.getData();
    }

    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrev();
        }
        System.out.println();
    }
}
