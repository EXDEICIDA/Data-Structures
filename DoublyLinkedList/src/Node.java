public class Node
{
    private Object data;
    private Node prev;
    private Node next;


    public Node(Object dataToAdd)
    {
        data = dataToAdd;
        prev = null;
        next = null;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


}
