public class LinkedQueue
{
    private Node front = null;
    private Node rear = null;
    private  int numberElements = 0;

    public void Enqueue(Object item) {
        Node newNode = new Node(item);
        if (front == null) {
            rear = newNode;
            front = newNode;
        } else {
            rear.setLink(newNode);
            rear = newNode;
        }
        numberElements++;
    }

    public Object Dequeue() {
       if (isEmpty()){
           System.out.println("Queue is empty");
           return null;
       }else{Object data = front.getData();
           front.getLink();
           numberElements --;
           return data;

       }
    }

    public Object peek ()
    {
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        else{

            return front.getData();
        }
    }



    public boolean isEmpty() {
        return front == null;
    }
    public int size() {
        return numberElements;
    }

}
