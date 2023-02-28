package Queue;

import LinkedList.LinkedList;

public class QueueWithLinkedList {
    LinkedList enqueue(LinkedList head, int data){
        LinkedList temp = new LinkedList(data);
        if (head==null) head=temp;
        else {
            LinkedList tempSecond = head;
            while (tempSecond.next!=null)
                tempSecond=tempSecond.next;

            tempSecond.next=temp;
        }
        return head;
    }

    LinkedList dequeue(LinkedList head){
        if(head==null) System.out.println("Underflow");
        else head = head.next;
        return head;
    }
    void display(LinkedList head)
    {

        System.out.println("\n list is : ");
        if(head==null){

            System.out.println("no LNodes");

            return;
        }

        LinkedList tmp=head;

        while(tmp!=null){

            System.out.print(tmp.data+" ");

            tmp=tmp.next;


        }
    }

}
