package Stack;

import LinkedList.LinkedList;

public class StackWithLinkedList {
    LinkedList push(int d, LinkedList head){

        LinkedList tmp1 = new LinkedList(d);

        if(head==null)

            head=tmp1;

        else
        {
            tmp1.next=head;

            head=tmp1;
        }
        return head;
    }


    LinkedList pop(LinkedList head){

        if(head==null)
            System.out.println("underflow");
        else
            head=head.next;
        return head;
    }


    void display(LinkedList head){

        System.out.println("\n list is : ");
        if(head==null){

            System.out.println("no LinkedLists");

            return;
        }

        LinkedList tmp=head;

        while(tmp!=null){

            System.out.print(tmp.data+" ");

            tmp=tmp.next;


        }
    }

    boolean isEmpty(LinkedList head)
    {
        if(head==null)
            return true;
        else
            return false;
    }

    int peek(LinkedList head)
    {
        if(head==null)
            return -1;
        return head.data;
    }

}


