public class LinkedStack {
    //LinkedStack
    /*
      What makes this data structure useful is that it can
      be dynamic  also we don't need know size of the data beforehand thus
      it's flexible

     */

    private Node top = null;
    private int numberElements = 0;

    //now we define our methods here

    public void push(Object item)
    {
        Node newNode = new Node(item);
        newNode.setLink(top);
        top = newNode;
        numberElements++;
        //A method that used variable we have defined before thus adding a new link
        //This will help us to insert an item or an object
    }

    public Object pop()
    {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else
        {
            Object data = top.getData();
            top = top.getLink();
            numberElements--;
            return data;
        }
    }


    public Object peek ()
    {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return top.getData();

    }


    public boolean isEmpty() {return  top ==null;}

    public int size() {return numberElements;}






}
