public class Test
{
    public static void main(String[] args)
    {
        LinkedQueue queue = new LinkedQueue();
        queue.Enqueue(100);
        queue.Enqueue(200);
        queue.Enqueue(300);
        queue.Enqueue(400);
        queue.Enqueue(500);
        queue.Enqueue(600);
        queue.Enqueue(700);
        System.out.println(queue.peek());
        System.out.println("Size is " + queue.size());


    }
}
