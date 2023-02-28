package Queue;

import LinkedList.LinkedList;

public class DemoWithLinkedList {
    public static void main(String[] args)
    {
        QueueWithLinkedList ob=new QueueWithLinkedList();
        LinkedList head=null;

        head=ob.enqueue(head,1);
        head=ob.enqueue(head,2);
        head=ob.enqueue(head,3);
        head=ob.enqueue(head,4);
        head=ob.enqueue(head,5);
        ob.display(head);
        head=ob.dequeue(head);
        ob.display(head);
    }
}
