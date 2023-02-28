package Queue;

public class Demo {
    public static void main(String[] args)
    {
        Queue ob=new Queue();
        ob.enqueue(12);
        ob.enqueue(24);
        ob.enqueue(32);
        ob.enqueue(41);
        ob.enqueue(58);
        ob.display();
        ob.dequeue();
        ob.display();
    }
}
